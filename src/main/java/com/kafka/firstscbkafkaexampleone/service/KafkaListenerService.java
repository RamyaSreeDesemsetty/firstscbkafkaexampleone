package com.kafka.firstscbkafkaexampleone.service;

import org.springframework.stereotype.Service;



import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaListenerService {

    @KafkaListener(topics = "CodeDecodeTopic", groupId = "codedecode-group")
    public void listenToCodeDecodeKafkaTopic(String messageReceived) {
        System.out.println("Message received is " + messageReceived);
    }
}

