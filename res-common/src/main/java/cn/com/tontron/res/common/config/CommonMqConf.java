package cn.com.tontron.res.common.config;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by yangyang on 2018/1/24.
 */
@Configuration
public class CommonMqConf {
    @Value("${res.mq.host}")
    private String mqHost;
    @Value("${res.mq.port}")
    private Integer mqPort;
    @Value("${res.mq.username}")
    private String mqUsername;
    @Value("${res.mq.password}")
    private String mqPassword;
    @Value("${res.mq.virtual-host}")
    private String mqVhost;
    @Value("${res.mq.exchange}")
    private String exchange;

    @Bean
    public CachingConnectionFactory cachingConnectionFactory() {
        CachingConnectionFactory cachingConnectionFactory = new CachingConnectionFactory();
        cachingConnectionFactory.setHost(mqHost);
        cachingConnectionFactory.setPort(mqPort);
        cachingConnectionFactory.setUsername(mqUsername);
        cachingConnectionFactory.setPassword(mqPassword);
        cachingConnectionFactory.setVirtualHost(mqVhost);
        return cachingConnectionFactory;
    }

    @Bean
    public RabbitAdmin rabbitAdmin() {
        return new RabbitAdmin(cachingConnectionFactory());
    }

    @Bean
    public RabbitTemplate rabbitTemplate() {
        RabbitTemplate rabbitTemplate = new RabbitTemplate(cachingConnectionFactory());
        return rabbitTemplate;
    }

    @Bean
    public DirectExchange resExchange() {
        DirectExchange directExchange = new DirectExchange(exchange, true, false);
        return directExchange;
    }
}
