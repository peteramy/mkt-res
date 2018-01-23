package cn.com.tontron.res.common.message.rsp;

/**
 * Created by yangyang on 2018/1/23.
 */
public class TcpCont {
    private String transactionId;
    private String reqTime;
    private String sign;

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
}
