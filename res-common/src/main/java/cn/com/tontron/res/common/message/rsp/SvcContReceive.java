package cn.com.tontron.res.common.message.rsp;

import com.fasterxml.jackson.databind.JsonNode;

/**
 * Created by yangyang on 2018/1/23.
 */
public class SvcContReceive {
    private String resultCode;
    private String resultMsg;
    private JsonNode resultObject;

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public JsonNode getResultObject() {
        return resultObject;
    }

    public void setResultObject(JsonNode resultObject) {
        this.resultObject = resultObject;
    }
}
