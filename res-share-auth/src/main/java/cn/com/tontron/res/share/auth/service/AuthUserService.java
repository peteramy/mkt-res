package cn.com.tontron.res.share.auth.service;

import cn.com.tontron.res.share.auth.entity.AuthUser;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by yangyang on 2018/1/15.
 */
@Service
@Transactional
public class AuthUserService {
    public AuthUser findByName(String username) {
        // TODO:
        return null;
    }
}
