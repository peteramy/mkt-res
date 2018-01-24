package cn.com.tontron.res.auth.config;

import cn.com.tontron.res.auth.component.ResAuthMqListener;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

/**
 * Created by yangyang on 2018/1/24.
 */
@Configuration
public class AuthMqConf {
    @Value("${res.auth.mq.name}")
    private String queueName;
    @Value("${res.mq.exchange}")
    private String exchange;
    @Autowired
    private CachingConnectionFactory cachingConnectionFactory;
    @Autowired
    private ResAuthMqListener resAuthMqListener;

    @Bean
    public Queue resAuthQueue() {
        Queue queue = new Queue(queueName, true, false, false);
        return queue;
    }

    @Bean
    public Binding resAuthBinding() {
        Binding binding = new Binding(queueName,
                Binding.DestinationType.QUEUE,
                exchange, queueName,
                new HashMap<String, Object>());
        return binding;
    }

    @Bean
    public MessageListenerAdapter resAuthMessageListenerAdapter() {
        MessageListenerAdapter messageListenerAdapter = new MessageListenerAdapter(resAuthMqListener);
        messageListenerAdapter.setDefaultListenerMethod("handle");
        messageListenerAdapter.setMessageConverter(null);
        return messageListenerAdapter;
    }

    @Bean
    public SimpleMessageListenerContainer resAuthSmlc() {
        SimpleMessageListenerContainer simpleMessageListenerContainer = new SimpleMessageListenerContainer();
        simpleMessageListenerContainer.setQueues(resAuthQueue());
        simpleMessageListenerContainer.setConnectionFactory(cachingConnectionFactory);
        simpleMessageListenerContainer.setMessageListener(resAuthMessageListenerAdapter());
        return simpleMessageListenerContainer;
    }
}
