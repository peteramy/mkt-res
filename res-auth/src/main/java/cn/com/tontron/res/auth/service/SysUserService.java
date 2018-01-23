package cn.com.tontron.res.auth.service;

import cn.com.tontron.res.auth.entity.QSysUser;
import cn.com.tontron.res.auth.entity.SysUser;
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
public class SysUserService {
    @Resource
    private JpaRepositoryImpl<SysUser, Long> sysUserRepo;

    public SysUser findByName(String s) {
        return sysUserRepo.findOne(QSysUser.sysUser.username.eq(s));
    }

    public List<SysUser> findAll() {
        return sysUserRepo.findAll();
    }

    public TablePage findUserPage(SearchForm searchForm) {
        return sysUserRepo.findAll(searchForm.asDslPageRequest());
    }

    public void randomSave() {
        SysUser user = new SysUser();
        user.setUsername("test" + Math.random());
        user.setPassword("123");
        sysUserRepo.save(user);
    }

    public void delete(Long id) {
        sysUserRepo.delete(id);
    }
}
