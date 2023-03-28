package com.learningstuff.kafkaeventspringboot.events.generic;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

public class GenericCustomStringEvent extends GenericCustomEvent<String> {

    public GenericCustomStringEvent(final Object source, final String what) {
        super(source, what);
    }

}