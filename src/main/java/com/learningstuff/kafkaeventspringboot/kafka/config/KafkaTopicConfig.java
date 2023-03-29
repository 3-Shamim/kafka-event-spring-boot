package com.learningstuff.kafkaeventspringboot.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

@Configuration
public class KafkaTopicConfig {


    // We need to add the KafkaAdmin Spring bean, which will automatically add topics for all beans of type NewTopic

    // To create a topic on startup, add a bean of type NewTopic. If the topic already exists, the bean is ignored.

    public final static String TOPIC_1 = "topic1";
    public final static String TOPIC_2 = "topic2";

//    @Value(value = "${spring.kafka.bootstrap-servers}")
//    private String bootstrapAddress;
//
//    @Bean
//    public KafkaAdmin kafkaAdmin() {
//        Map<String, Object> configs = new HashMap<>();
//        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
//        return new KafkaAdmin(configs);
//    }

    @Bean
    public NewTopic topic1() {
        return TopicBuilder.name(TOPIC_1).build();
    }

    @Bean
    public NewTopic topic2() {
        return TopicBuilder.name(TOPIC_2).build();
    }

}
