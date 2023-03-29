package com.learningstuff.kafkaeventspringboot.events.annotation_driven;

import com.learningstuff.kafkaeventspringboot.dto.Person;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */


public class GenericPersonEvent extends GenericEvent<Person> {

    public GenericPersonEvent(final Person what, final boolean success) {
        super(what, success);
    }

}