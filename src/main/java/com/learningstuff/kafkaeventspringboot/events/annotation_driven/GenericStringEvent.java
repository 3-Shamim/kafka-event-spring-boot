package com.learningstuff.kafkaeventspringboot.events.annotation_driven;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */


public class GenericStringEvent extends GenericEvent<String> {

    public GenericStringEvent(final String what, final boolean success) {
        super(what, success);
    }

}