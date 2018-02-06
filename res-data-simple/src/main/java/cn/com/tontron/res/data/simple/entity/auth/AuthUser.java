package cn.com.tontron.res.data.simple.entity.auth;


import cn.com.tontron.res.data.simple.base.entity.AutoModel;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "auth_user")
@Entity
public class AuthUser extends AutoModel {
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
