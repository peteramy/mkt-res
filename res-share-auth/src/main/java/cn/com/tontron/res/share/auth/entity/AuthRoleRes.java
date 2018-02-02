package cn.com.tontron.res.share.auth.entity;

import cn.com.tontron.res.common.base.entity.AutoModel;

/**
 * Created by yangyang on 2018/1/29.
 */
public class AuthRoleRes extends AutoModel {
    private AuthRes res;
    private AuthRole role;

    public AuthRes getRes() {
        return res;
    }

    public void setRes(AuthRes res) {
        this.res = res;
    }

    public AuthRole getRole() {
        return role;
    }

    public void setRole(AuthRole role) {
        this.role = role;
    }
}
