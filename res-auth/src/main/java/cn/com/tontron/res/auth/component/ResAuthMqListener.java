package cn.com.tontron.res.auth.component;

import cn.com.tontron.res.common.base.entity.ResMs;
import cn.com.tontron.res.common.component.IResMqListener;
import cn.com.tontron.res.common.service.MsCallService;
import org.springframework.amqp.core.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by yangyang on 2018/1/24.
 */
@Component
public class ResAuthMqListener implements IResMqListener {
    @Autowired
    private MsCallService msCallService;

    @Override
    public Message handle(Message message) {
        return msCallService.receive(ResMs.auth, message);
    }
}
