package cn.com.tontron.res.share.auth.entity;

import cn.com.tontron.res.common.base.entity.AutoModel;

/**
 * Created by yangyang on 2018/1/29.
 */
public class AuthRes extends AutoModel {
    private AuthRes pRes;
    private String code;

    public AuthRes getpRes() {
        return pRes;
    }

    public void setpRes(AuthRes pRes) {
        this.pRes = pRes;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
