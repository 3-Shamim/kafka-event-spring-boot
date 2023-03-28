package com.learningstuff.kafkaeventspringboot.events.generic;

import org.springframework.context.ApplicationEvent;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

public class GenericCustomEvent<T> extends ApplicationEvent {

    private final T what;

    public GenericCustomEvent(final Object source, final T what) {
        super(source);
        this.what = what;
    }

    public T getWhat() {
        return what;
    }

}