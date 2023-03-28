package com.learningstuff.kafkaeventspringboot.events.annotation_driven;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

@Component
public class GenericEventListener {

    //    @EventListener(condition = "!#event.success")
    @EventListener(condition = "#event.success")
    public void handleSuccessful(GenericEvent<String> event) {
        System.out.println("(Annotation Driven) Handling generic event (conditional). " + event.isSuccess());
        System.out.println();
    }

    @EventListener
    public void handleGenericEvent(GenericEvent<?> event) {
        System.out.println("(Annotation Driven) Received generic event - " + event.getWhat());
        System.out.println();
    }

}
