package cn.com.tontron.res.common.message.rsp;

/**
 * Created by yangyang on 2018/1/23.
 */
public class SvcContSend {
    private String resultCode;
    private String resultMsg;
    private Object resultObject;

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

    public Object getResultObject() {
        return resultObject;
    }

    public void setResultObject(Object resultObject) {
        this.resultObject = resultObject;
    }
}
