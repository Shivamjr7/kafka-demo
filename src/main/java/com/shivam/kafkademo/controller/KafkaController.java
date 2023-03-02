package com.shivam.kafkademo.controller;

import com.shivam.kafkademo.domain.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/user")
public class KafkaController {

    @Autowired
    private KafkaTemplate<String , String> kafkaTemplate;

    @PostMapping
    void publish (@RequestBody Message msg )
    {
        kafkaTemplate.send("user", msg.getData());
    }

}
