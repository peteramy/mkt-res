package cn.com.tontron.res.data.simple.service.auth;

import cn.com.tontron.res.common.base.page.TablePage;
import cn.com.tontron.res.common.component.EasyJsonComponent;
import cn.com.tontron.res.common.message.req.MsReqReceiveMsg;
import cn.com.tontron.res.data.simple.base.jpa.JpaRepositoryImpl;
import cn.com.tontron.res.data.simple.search.auth.AuthUserSearch;
import cn.com.tontron.res.data.simple.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.io.IOException;

/**
 * Created by yangyang on 2018/2/6.
 */
@Service
@Transactional
public class AuthUserService implements IBaseService {
    @Resource
    private JpaRepositoryImpl authUserRepo;
    @Autowired
    private EasyJsonComponent easyJsonComponent;

    @Override
    public TablePage<Object> findAll(MsReqReceiveMsg reqMsg) throws IOException {
        AuthUserSearch search = easyJsonComponent.treeToValue(reqMsg.getSvcCont().getRequestObject(), AuthUserSearch.class);
        return authUserRepo.findAll(search.asDslPageRequest());
    }
}
