package cn.com.tontron.res.common.message.req;

import com.fasterxml.jackson.databind.JsonNode;

/**
 * Created by yangyang on 2018/1/23.
 */
public class TcpCont {
    private String svcCode;
    private String apiCode;
    private String appKey;
    private String dstSysId;
    private String transactionId;
    private String reqTime;
    private String sign;
    private String version;

    public TcpCont() {
    }

    public TcpCont(JsonNode jsonNode) {
        this.svcCode = jsonNode.get("svcCode").asText();
        this.apiCode = jsonNode.get("apiCode").asText();
        this.appKey = jsonNode.get("appKey").asText();
        this.dstSysId = jsonNode.get("dstSysId").asText();
        this.transactionId = jsonNode.get("transactionId").asText();
        this.reqTime = jsonNode.get("").asText();
        this.sign = jsonNode.get("reqTime").asText();
        this.version = jsonNode.get("version").asText();
    }

    public String getSvcCode() {
        return svcCode;
    }

    public void setSvcCode(String svcCode) {
        this.svcCode = svcCode;
    }

    public String getApiCode() {
        return apiCode;
    }

    public void setApiCode(String apiCode) {
        this.apiCode = apiCode;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getDstSysId() {
        return dstSysId;
    }

    public void setDstSysId(String dstSysId) {
        this.dstSysId = dstSysId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getReqTime() {
        return reqTime;
    }

    public void setReqTime(String reqTime) {
        this.reqTime = reqTime;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
