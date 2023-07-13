package com.example.demo.kafkaController;

import com.example.demo.Producer.kafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafkaApplication")
public class KafkaController {

    private final kafkaProducer producer;

    @Autowired
    public KafkaController(kafkaProducer producer){
        this.producer = producer;
    }

    @PostMapping("/publishMessage")
    public void sendMessage(@RequestParam("message") String message){
        this.producer.sendMessage(message);
    }
}
