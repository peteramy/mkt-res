package com.shtel.mktrescenter.biz.ui.dto;

import com.shtel.paas.sdk.core.PaasBaseObject;

/**
 * Created by yangyang on 2018/3/13.
 */
public class TestDTO extends PaasBaseObject {
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
