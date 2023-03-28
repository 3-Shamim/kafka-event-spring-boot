package com.learningstuff.kafkaeventspringboot.events;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

@Getter
public class CustomSpringEvent extends ApplicationEvent {

    private final String message;

    public CustomSpringEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

}