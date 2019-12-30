package com.itcast.springboot_rabbitmq_consumer.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MyListener {
    @RabbitListener(queues = "item_queue")
    public void listener(String message) {
        System.out.println("消费端监听到的消息为："+message);
    }
}
