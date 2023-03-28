//package com.learningstuff.kafkaeventspringboot.events;
//
//import org.springframework.context.event.ContextStartedEvent;
//import org.springframework.context.event.EventListener;
//import org.springframework.stereotype.Component;
//import org.springframework.transaction.event.TransactionPhase;
//import org.springframework.transaction.event.TransactionalEventListener;
//
///**
// * Created by IntelliJ IDEA.
// * User: Md. Shamim Molla
// * Email: shamim.molla@vivasoftltd.com
// */
//
//@Component
//public class AnnotationDrivenEventListener {
//    @EventListener
////    @EventListener(classes = { ContextStartedEvent.class, ContextStoppedEvent.class })
//    public void handleContextStart(ContextStartedEvent cse) {
//        System.out.println("Handling context started event.");
//    }
//
//    @EventListener(condition = "#event.success")
//    public void handleSuccessful(GenericSpringEvent<String> event) {
//        System.out.println("Handling generic event (conditional).");
//    }
//
//    @TransactionalEventListener(phase = TransactionPhase.BEFORE_COMMIT)
//    public void handleCustom(CustomSpringEvent event) {
//        System.out.println("Handling event inside a transaction BEFORE COMMIT.");
//    }
//
//}