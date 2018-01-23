package cn.com.tontron.res.common.message.req;

/**
 * Created by yangyang on 2018/1/23.
 */
public class MsReqSendMsg {
    private TcpCont tcpCont;
    private SvcContSend svcCont;

    public MsReqSendMsg() {
    }

    public MsReqSendMsg(TcpCont tcpCont, SvcContSend svcCont) {
        this.tcpCont = tcpCont;
        this.svcCont = svcCont;
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
