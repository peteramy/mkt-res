package cn.com.tontron.res.data.simple.entity.auth;

import cn.com.tontron.res.data.simple.base.entity.AutoModel;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by yangyang on 2018/1/29.
 */
@Table(name = "auth_role")
@Entity
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
