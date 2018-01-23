package cn.com.tontron.res.auth.entity;

import cn.com.tontron.res.common.base.entity.AutoModel;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "sys_user")
@Entity
public class SysUser extends AutoModel {
    private String password;
    private String username;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
