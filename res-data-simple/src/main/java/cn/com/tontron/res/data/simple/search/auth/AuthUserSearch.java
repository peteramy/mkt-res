package cn.com.tontron.res.data.simple.search.auth;

import cn.com.tontron.res.data.simple.base.search.QSearchForm;

/**
 * Created by yangyang on 2018/2/6.
 */
public class AuthUserSearch extends QSearchForm {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
