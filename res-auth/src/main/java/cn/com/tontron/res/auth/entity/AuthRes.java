package cn.com.tontron.res.auth.entity;

import cn.com.tontron.res.common.base.entity.AutoModel;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by yangyang on 2018/1/29.
 */
@Table(name = "auth_res")
@Entity
public class AuthRes extends AutoModel {
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
