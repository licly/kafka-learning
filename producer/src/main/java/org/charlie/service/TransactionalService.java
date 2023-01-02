package org.charlie.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 事务示例
 *
 * @author Charlie-6327
 * @date 2022/12/23
 */

@Service
public class TransactionalService {

    @Resource
    private KafkaTemplate kafkaTemplate;

    public void sendMsg() {

    }
}
