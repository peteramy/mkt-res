package cn.com.tontron.res.common.message.rsp;


import com.fasterxml.jackson.databind.JsonNode;

/**
 * Created by yangyang on 2018/1/23.
 */
public class MsRspReceiveMsg {
    private TcpCont tcpCont;
    private SvcContReceive svcCont;

    public MsRspReceiveMsg() {
    }

    public MsRspReceiveMsg(JsonNode jsonNode) {
        this.tcpCont = new TcpCont();
        this.tcpCont.setReqTime(jsonNode.get("tcpCont").get("reqTime") == null ? "" : jsonNode.get("tcpCont").get("reqTime").asText());
        this.tcpCont.setSign(jsonNode.get("tcpCont").get("sign") == null ? "" : jsonNode.get("tcpCont").get("sign").asText());
        this.tcpCont.setTransactionId(jsonNode.get("tcpCont").get("transactionId") == null ? "" : jsonNode.get("tcpCont").get("transactionId").asText());

        this.svcCont = new SvcContReceive();
        this.svcCont.setResultCode(jsonNode.get("tcpCont").get("resultCode") == null ? "" : jsonNode.get("svcCont").get("resultCode").asText());
        this.svcCont.setResultMsg(jsonNode.get("tcpCont").get("resultMsg") == null ? "" : jsonNode.get("svcCont").get("resultMsg").asText());
        this.svcCont.setResultObject(jsonNode.get("svcCont").get("resultObject"));
    }

    public TcpCont getTcpCont() {
        return tcpCont;
    }

    public void setTcpCont(TcpCont tcpCont) {
        this.tcpCont = tcpCont;
    }

    public SvcContReceive getSvcCont() {
        return svcCont;
    }

    public void setSvcCont(SvcContReceive svcCont) {
        this.svcCont = svcCont;
    }
}
