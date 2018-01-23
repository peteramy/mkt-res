package cn.com.tontron.res.auth.provider;


import cn.com.tontron.res.common.ms.MsProvider;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by yangyang on 2018/1/23.
 */
@MsProvider(name = "auth", type = MsProvider.Type.Outside)
@Component
public class ResAuthOutsideProvider  {

}
