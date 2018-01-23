package cn.com.tontron.res.common.message.req;

import com.fasterxml.jackson.databind.JsonNode;

/**
 * Created by yangyang on 2018/1/23.
 */
public class MsReqReceiveMsg {
    private TcpCont tcpCont;
    private SvcContReceive svcCont;

    public MsReqReceiveMsg() {
    }

    public MsReqReceiveMsg(TcpCont tcpCont, SvcContReceive svcCont) {
        this.tcpCont = tcpCont;
        this.svcCont = svcCont;
    }

    public MsReqReceiveMsg(JsonNode msgNode) {
        this.tcpCont = new TcpCont(msgNode.get("tcpCont"));
        this.svcCont = new SvcContReceive(msgNode.get("svcCont"));
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
