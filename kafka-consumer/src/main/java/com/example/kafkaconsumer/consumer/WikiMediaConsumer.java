package com.example.kafkaconsumer.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class WikiMediaConsumer {

    @KafkaListener(topics = "wiki-topic", groupId = "myGroup")
    public void consumeMsg(String msg){
        log.info(String.format("Consuming message from wiki-topic :: %s", msg));
    }
}
