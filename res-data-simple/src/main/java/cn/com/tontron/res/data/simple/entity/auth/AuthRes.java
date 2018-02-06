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
@Table(name = "auth_res")
@Entity
public class AuthRes extends AutoModel {
    @ManyToOne
    @JoinColumn(name = "pid", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
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
