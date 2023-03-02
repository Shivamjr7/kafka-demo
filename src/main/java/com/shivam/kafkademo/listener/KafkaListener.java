package com.shivam.kafkademo.listener;

import org.springframework.stereotype.Component;

@Component
public class KafkaListener {

    @org.springframework.kafka.annotation.KafkaListener(topics = "user", groupId = "group1")
    void listener(String data)
    {
        System.out.println("data : "+ data);
    }

}
