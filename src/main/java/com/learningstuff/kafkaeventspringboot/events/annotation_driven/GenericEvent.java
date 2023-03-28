package com.learningstuff.kafkaeventspringboot.events.annotation_driven;

import lombok.Getter;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

@Getter
public class GenericEvent<T> {

    private final T what;
    protected boolean success;

    public GenericEvent(T what, boolean success) {
        this.what = what;
        this.success = success;
    }

}