package cn.com.tontron.res.common.message.req;

import com.fasterxml.jackson.databind.JsonNode;

/**
 * Created by yangyang on 2018/1/23.
 */
public class SvcContReceive {
    private JsonNode requestObject;

    public SvcContReceive() {
    }

    public SvcContReceive(JsonNode jsonNode) {
        this.requestObject = jsonNode.get("requestObject");
    }

    public JsonNode getRequestObject() {
        return requestObject;
    }

    public void setRequestObject(JsonNode requestObject) {
        this.requestObject = requestObject;
    }
}
