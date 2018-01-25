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

    public static MsRspSendMsg MethodNotFount(MsReqReceiveMsg req) {
        MsRspSendMsg msg = new MsRspSendMsg();
        msg.tcpCont = new TcpCont();
        msg.tcpCont.setTransactionId(req.getTcpCont().getTransactionId());
        msg.svcCont = new SvcContSend();
        msg.svcCont.setResultCode("-1");
        msg.svcCont.setResultMsg("Method not found.");
        return msg;
    }

    public static MsRspSendMsg ProcessError(MsReqReceiveMsg receiveMsg, String message) {
        MsRspSendMsg msg = new MsRspSendMsg();
        msg.tcpCont = new TcpCont();
        msg.tcpCont.setTransactionId(receiveMsg.getTcpCont().getTransactionId());
        msg.svcCont = new SvcContSend();
        msg.svcCont.setResultCode("-1");
        msg.svcCont.setResultMsg(message);
        return msg;
    }

    public static MsRspSendMsg ParseError(String message) {
        MsRspSendMsg msg = new MsRspSendMsg();
        msg.tcpCont = new TcpCont();
        msg.svcCont = new SvcContSend();
        msg.svcCont.setResultCode("-1");
        msg.svcCont.setResultMsg(message);
        return msg;
    }
}
