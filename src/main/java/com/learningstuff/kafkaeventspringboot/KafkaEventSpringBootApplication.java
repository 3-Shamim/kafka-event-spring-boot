package com.learningstuff.kafkaeventspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class KafkaEventSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaEventSpringBootApplication.class, args);
    }

}
