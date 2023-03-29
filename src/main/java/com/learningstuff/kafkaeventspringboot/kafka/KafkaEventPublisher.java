package com.learningstuff.kafkaeventspringboot.kafka;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.learningstuff.kafkaeventspringboot.dto.Person;
import com.learningstuff.kafkaeventspringboot.kafka.config.KafkaTopicConfig;
import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

@AllArgsConstructor
@Component
public class KafkaEventPublisher {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Scheduled(fixedDelay = 2000)
    public void publishKafkaEventForTopic1() {

        System.out.println("=================================================================");
        System.out.println("Publish kafka event for " + KafkaTopicConfig.TOPIC_1);
        System.out.println("=================================================================");

        kafkaTemplate.send(KafkaTopicConfig.TOPIC_1, "Hello");

        int age = (int) (Math.random() * 20 + 20);
        Person person = new Person("Person - " + age, age);

        try {
            // We can also send without converting to string using JsonSerializer in Producer & Consumer config. Ref: https://www.baeldung.com/spring-kafka
            String personString = new ObjectMapper().writeValueAsString(person);
            CompletableFuture<SendResult<String, String>> future = kafkaTemplate.send(KafkaTopicConfig.TOPIC_1, "Key", personString);

            future.whenComplete((result, ex) -> {
                if (ex == null) {
                    System.out.println("Sent message=[" + personString + "] with offset=[" + result.getRecordMetadata().offset() + "]");
                } else {
                    System.out.println("Unable to send message=[" + personString + "] due to : " + ex.getMessage());
                }
            });

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }

}
