package cn.com.tontron.res.data.simple.service.auth;

import cn.com.tontron.res.data.simple.base.jpa.JpaRepositoryImpl;
import cn.com.tontron.res.data.simple.service.IBaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by yangyang on 2018/2/6.
 */
@Service
@Transactional
public class AuthUserService implements IBaseService {
    @Resource
    private JpaRepositoryImpl authUserRepo;

    @Override
    public List<Object> findAll(HttpServletRequest request) {
        // TODO:
        return authUserRepo.findAll();
    }
}
