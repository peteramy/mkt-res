package cn.com.tontron.res.common.component;

import org.springframework.amqp.core.Message;

/**
 * Created by yangyang on 2018/1/24.
 */
public interface IResMqListener {
    public Message handle(Message message);
}
