package cn.com.tontron.res.auth.service;

import cn.com.tontron.res.auth.entity.AuthUser;
import cn.com.tontron.res.auth.entity.QAuthUser;
import cn.com.tontron.res.common.base.form.SearchForm;
import cn.com.tontron.res.common.base.jpa.JpaRepositoryImpl;
import cn.com.tontron.res.common.base.page.TablePage;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yangyang on 2018/1/15.
 */
@Service
@Transactional
public class AuthUserService {
    @Resource
    private JpaRepositoryImpl<AuthUser, Long> authUserRepo;
    private QAuthUser qAuthUser = QAuthUser.authUser;

    public AuthUser findByName(String s) {
        return authUserRepo.findOne(qAuthUser.username.eq(s));
    }

    public List<AuthUser> findAll() {
        return authUserRepo.findAll();
    }

    public TablePage findUserPage(SearchForm searchForm) {
        return authUserRepo.findAll(searchForm.asDslPageRequest());
    }

    public void delete(Long id) {
        authUserRepo.delete(id);
    }
}
