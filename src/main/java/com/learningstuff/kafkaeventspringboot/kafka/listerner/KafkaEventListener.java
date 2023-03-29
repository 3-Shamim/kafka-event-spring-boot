package com.learningstuff.kafkaeventspringboot.kafka.listerner;

import com.learningstuff.kafkaeventspringboot.kafka.config.KafkaTopicConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.PartitionOffset;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

@Configuration
public class KafkaEventListener {


    //    @KafkaListener(topics = "topic1, topic2", groupId = "groupId")
    @KafkaListener(topics = KafkaTopicConfig.TOPIC_1, groupId = "groupId")
    public void listenGroupFoo(String message) {
        System.out.println("Received Message in group groupId: " + message);
        System.out.println();
    }

//    @KafkaListener(topics = "topicName")
//    public void listenWithHeaders(@Payload String message, @Header(KafkaHeaders.RECEIVED_PARTITION) int partition) {
//        System.out.println("Received Message: " + message + " from partition: " + partition);
//    }

//    @KafkaListener(topicPartitions = @TopicPartition(topic = "topicName", partitions = { "0", "1" }))
//    @KafkaListener(
//            topicPartitions = @TopicPartition(
//                    topic = "topicName",
//                    partitionOffsets = {
//                            @PartitionOffset(partition = "0", initialOffset = "0"),
//                            @PartitionOffset(partition = "3", initialOffset = "0")
//                    }),
//            containerFactory = "partitionsKafkaListenerContainerFactory"
//    )
//    public void listenToPartition(@Payload String message, @Header(KafkaHeaders.RECEIVED_PARTITION) int partition) {
//        System.out.println("Received Message: " + message + "from partition: " + partition);
//    }

//    @KafkaListener(topics = "topicName", containerFactory = "filterKafkaListenerContainerFactory")
//    public void listenWithFilter(String message) {
//        System.out.println("Received Message in filtered listener: " + message);
//    }


}
