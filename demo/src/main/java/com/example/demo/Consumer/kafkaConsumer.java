package com.example.demo.Consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class kafkaConsumer {

    private final Logger logger = LoggerFactory.getLogger(kafkaConsumer.class);

    @KafkaListener(topics = "firstUser", groupId = "group_id")
    public void consume(String message){
        logger.info(String.format("$$$ -> Consumed Message -> %s",message));
    }
}
