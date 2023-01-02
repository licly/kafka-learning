package org.charlie.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Charlie-6327
 * @date 2022/12/23
 */

@Service
public class GreetingService {

    @KafkaListener(topics = "greeting")
    private void processMessage(String message) {
        System.out.println(message);
    }
}
