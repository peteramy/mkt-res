package cn.com.tontron.res.data.simple.entity.auth;

import cn.com.tontron.res.data.simple.base.entity.AutoModel;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Created by yangyang on 2018/1/29.
 */
@Table(name = "auth_role_res")
@Entity
public class AuthRoleRes extends AutoModel {
    @ManyToOne
    @JoinColumn(name = "res_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private AuthRes res;
    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
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
