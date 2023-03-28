package com.learningstuff.kafkaeventspringboot.events.generic;

import lombok.NonNull;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

@Component
public class GenericCustomEventListener implements ApplicationListener<GenericCustomEvent<?>> {

    @Override
    public void onApplicationEvent(@NonNull final GenericCustomEvent<?> event) {
        System.out.println("Received custom generic event - " + event.getWhat());
        System.out.println();
    }

}