package cn.com.tontron.res.share.auth.entity;

import cn.com.tontron.res.common.base.entity.AutoModel;

/**
 * Created by yangyang on 2018/1/29.
 */
public class AuthUserRole extends AutoModel {
    private AuthUser user;
    private AuthRole role;

    public AuthUser getUser() {
        return user;
    }

    public void setUser(AuthUser user) {
        this.user = user;
    }

    public AuthRole getRole() {
        return role;
    }

    public void setRole(AuthRole role) {
        this.role = role;
    }
}
