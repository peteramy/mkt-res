package cn.com.tontron.res.common.message.rsp;

import cn.com.tontron.res.common.message.req.MsReqReceiveMsg;

/**
 * Created by yangyang on 2018/1/23.
 */
public class MsRspSendMsg {
    private TcpCont tcpCont;
    private SvcContSend svcCont;

    public MsRspSendMsg() {

    }

    public MsRspSendMsg(Object o, MsReqReceiveMsg req) {
        this.tcpCont = new TcpCont();
        this.tcpCont.setTransactionId(req.getTcpCont().getTransactionId());
        this.svcCont = new SvcContSend();
        this.svcCont.setResultObject(o);
    }

    public TcpCont getTcpCont() {
        return tcpCont;
    }

    public void setTcpCont(TcpCont tcpCont) {
        this.tcpCont = tcpCont;
    }

    public SvcContSend getSvcCont() {
        return svcCont;
    }

    public void setSvcCont(SvcContSend svcCont) {
        this.svcCont = svcCont;
    }
}
