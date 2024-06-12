package com.revanth.kafka.consumer;

import com.revanth.kafka.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    // @KafkaListener(topics = "revanth", groupId = "myGroup")
    public void consumeMessage(String msg) {
        log.info(String.format("Consuming the message from revanth topic:: %s", msg));
    }

    @KafkaListener(topics = "revanth", groupId = "myGroup")
    public void consumeJsonMessage(Student student) {
        log.info(String.format("Consuming the message from revanth topic:: %s", student.toString()));
    }
}
