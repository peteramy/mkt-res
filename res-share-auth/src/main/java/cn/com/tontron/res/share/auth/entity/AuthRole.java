package cn.com.tontron.res.share.auth.entity;

import cn.com.tontron.res.common.base.entity.AutoModel;

/**
 * Created by yangyang on 2018/1/29.
 */
public class AuthRole extends AutoModel {
    private String name;
    private String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
