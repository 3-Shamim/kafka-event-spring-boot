package com.learningstuff.kafkaeventspringboot.events;

import com.learningstuff.kafkaeventspringboot.events.annotation_driven.GenericEvent;
import com.learningstuff.kafkaeventspringboot.events.annotation_driven.GenericStringEvent;
import com.learningstuff.kafkaeventspringboot.dto.Person;
import com.learningstuff.kafkaeventspringboot.events.generic.GenericCustomEvent;
import com.learningstuff.kafkaeventspringboot.events.generic.GenericCustomPersonEvent;
import com.learningstuff.kafkaeventspringboot.events.generic.GenericCustomStringEvent;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

@AllArgsConstructor
@Component
public class SpringEventPublisher {

    private final ApplicationEventPublisher applicationEventPublisher;

    public void publishCustomEvent(final String message) {
        System.out.println("=================================================================");
        System.out.println("Publishing custom event.");
        System.out.println("=================================================================");
        CustomSpringEvent customSpringEvent = new CustomSpringEvent(this, message);
        applicationEventPublisher.publishEvent(customSpringEvent);
    }

//    @Scheduled(fixedDelay = 2000)
    public void sendCustomEvent() {
        publishCustomEvent(
                String.format("%s-%s", "Custom Event", LocalDateTime.now())
        );
    }

    public void publishGenericEvent(final String message) {
        System.out.println("=================================================================");
        System.out.println("Publishing generic event.");
        System.out.println("=================================================================");

        GenericEvent<String> event = new GenericStringEvent(message, ((int) (Math.random() * 10 + 1)) % 2 == 0);
        applicationEventPublisher.publishEvent(event);

        Person person = new Person("Bob", (int) (Math.random() * 10 + 10));
        final GenericCustomEvent<Person> event1 = new GenericCustomPersonEvent(this, person);
        applicationEventPublisher.publishEvent(event1);
    }

//    @Scheduled(fixedDelay = 2000)
    public void sendGenericEvent() {
        publishGenericEvent(
                String.format("%s-%s", "Generic Event", LocalDateTime.now())
        );
    }

    public void publishGenericCustomEvent(final String name) {

        System.out.println("=================================================================");
        System.out.println("Publishing generic custom event.");
        System.out.println("=================================================================");

        final GenericCustomEvent<String> event = new GenericCustomStringEvent(this, name);
        applicationEventPublisher.publishEvent(event);

        Person person = new Person("Rob", (int) (Math.random() * 10 + 10));
        final GenericCustomEvent<Person> event1 = new GenericCustomPersonEvent(this, person);
        applicationEventPublisher.publishEvent(event1);

    }

//    @Scheduled(fixedDelay = 5000, initialDelay = 5000)
    public void sendGenericCustomEvent() {
        publishGenericCustomEvent(
                String.format("%s-%s", "Generic Custom Event", LocalDateTime.now())
        );
    }

}