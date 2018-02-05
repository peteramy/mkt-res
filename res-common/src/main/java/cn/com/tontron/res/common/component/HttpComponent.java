package cn.com.tontron.res.common.component;

import com.fasterxml.jackson.databind.JsonNode;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.fluent.Content;
import org.apache.http.client.fluent.Request;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Component
public class HttpComponent {
    private Logger logger = LoggerFactory.getLogger(HttpComponent.class);
    @Resource
    private EasyJsonComponent easyJson;

    public String call(RequestMethod method, String url, String body) {
        Request request = null;
        switch (method) {
            case POST:
                request = Request.Post(url);
                break;
            case GET:
                request = Request.Get(url);
                break;
            case PUT:
                request = Request.Put(url);
                break;
            case DELETE:
                request = Request.Delete(url);
                break;
            default:
                break;
        }
        if (request != null) {
            try {
                Content content = request.bodyString(body, ContentType.APPLICATION_JSON)
                        .connectTimeout(5000).socketTimeout(5000).execute().returnContent();
                String resBody = content.asString(Charset.forName("utf-8"));
                return resBody;
            } catch (IOException e) {
                logger.error(e.getMessage());
            }
        }
        return null;
    }

    public JsonNode get(String url) {
        String json = getResponseJson(url);
        JsonNode jsonNode = easyJson.readTree(json);
        if (jsonNode.has("errcode") && jsonNode.get("errcode").asInt() != 0) {
            throw new RuntimeException(json);
        }
        return jsonNode;
    }

    public String getResponseJson(String url) {
        try {
            logger.info("http get {}", url);
            Content t = Request.Get(url).connectTimeout(5000)
                    .socketTimeout(5000).addHeader("User-Agent", "WeiXinCms")
                    .execute().returnContent();
            String json = new String(t.asBytes(), "UTF-8");
            return json;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public String post(Request request) {
        try {
            Content t = request.execute().returnContent();
            return new String(t.asBytes(), "UTF-8");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public JsonNode post(String url, String data) {
        try {
            logger.info("http post {} data {}", url, data);
            Content t = Request.Post(url)
                    .bodyString(data, ContentType.APPLICATION_JSON)
                    .execute().returnContent();
            String json = new String(t.asBytes(), "UTF-8");
            JsonNode jsonNode = easyJson.readTree(json);
            if (jsonNode.has("errcode") && jsonNode.get("errcode").asInt() != 0) {
                throw new RuntimeException(json);
            }
            return jsonNode;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public JsonNode post(String url, byte[] data, String contentType) {
        try {
            logger.info("http post {} data {}", url, data);
            Content t = Request.Post(url)
                    .bodyByteArray(data, ContentType.create(contentType))
                    .execute().returnContent();
            String json = new String(t.asBytes(), "UTF-8");
            JsonNode jsonNode = easyJson.readTree(json);
            if (jsonNode.has("errcode") && jsonNode.get("errcode").asInt() != 0) {
                throw new RuntimeException(json);
            }
            return jsonNode;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public JsonNode multipartPost(String url, HttpEntity entity) {
        try {
            logger.info("http multipartPost {}", url);
            Content t = Request.Post(url)
                    .body(entity).execute().returnContent();
            String json = new String(t.asBytes(), "UTF-8");
            logger.info("http multipartPost result json:{}", json);
            JsonNode jsonNode = easyJson.readTree(json);
            if (jsonNode.has("errcode") && jsonNode.get("errcode").asInt() != 0) {
                throw new RuntimeException(json);
            }
            return jsonNode;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public JsonNode postFile(String url, File file) {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            HttpPost httppost = new HttpPost(url);
            MultipartEntityBuilder multipartEntityBuilder = MultipartEntityBuilder.create().setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
            multipartEntityBuilder.addPart("file", new FileBody(file));
            httppost.setEntity(multipartEntityBuilder.build());
            HttpResponse response = httpclient.execute(httppost);
            int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode == HttpStatus.SC_OK) {
                HttpEntity resEntity = response.getEntity();
                String result = EntityUtils.toString(resEntity);
                return easyJson.readTree(result);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                httpclient.close();
            } catch (Exception ignore) {
                throw new RuntimeException(ignore);
            }
        }
        return null;
    }

    public JsonNode httpsPost(String url, String data) {
        try {
            HttpClient httpClient = new SSLClient();
            HttpPost httpPost = new HttpPost(url);
            httpPost.setEntity(new StringEntity(data));
            httpPost.setHeader("Content-Type", "application/json");
            HttpResponse response = httpClient.execute(httpPost);
            if (response != null) {
                HttpEntity resEntity = response.getEntity();
                if (resEntity != null) {
                    String result = EntityUtils.toString(resEntity, "utf8");
                    return easyJson.readTree(result);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public JsonNode httpsPost(String url, Map<String, String> dataMap) {
        try {
            HttpClient httpClient = new SSLClient();
            HttpPost httpPost = new HttpPost(url);
            httpPost.setHeader("Content-Type", "application/json");
            List<NameValuePair> list = new ArrayList<NameValuePair>();
            Iterator iterator = dataMap.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, String> elem = (Map.Entry<String, String>) iterator.next();
                list.add(new BasicNameValuePair(elem.getKey(), elem.getValue()));
            }
            if (list.size() > 0) {
                UrlEncodedFormEntity entity = new UrlEncodedFormEntity(list, "utf8");
                httpPost.setEntity(entity);
            }
            HttpResponse response = httpClient.execute(httpPost);
            if (response != null) {
                HttpEntity resEntity = response.getEntity();
                if (resEntity != null) {
                    String result = EntityUtils.toString(resEntity, "utf8");
                    return easyJson.readTree(result);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public class SSLClient extends DefaultHttpClient {
        public SSLClient() throws Exception {
            super();
            SSLContext ctx = SSLContext.getInstance("TLS");
            X509TrustManager tm = new X509TrustManager() {
                @Override
                public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                }

                @Override
                public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                }

                @Override
                public X509Certificate[] getAcceptedIssuers() {
                    return null;
                }
            };
            ctx.init(null, new TrustManager[]{tm}, null);
            SSLSocketFactory ssf = new SSLSocketFactory(ctx, SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
            ClientConnectionManager ccm = this.getConnectionManager();
            SchemeRegistry sr = ccm.getSchemeRegistry();
            sr.register(new Scheme("https", 443, ssf));
        }
    }
}
