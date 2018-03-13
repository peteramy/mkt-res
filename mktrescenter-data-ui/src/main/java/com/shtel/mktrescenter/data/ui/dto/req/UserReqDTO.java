package com.shtel.mktrescenter.data.ui.dto.req;

import com.shtel.paas.sdk.core.PaasBaseObject;

/**
 * Created by yangyang on 2018/3/13.
 */
public class UserReqDTO extends PaasBaseObject {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
