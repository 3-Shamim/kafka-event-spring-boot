package com.learningstuff.kafkaeventspringboot.events.generic;

import com.learningstuff.kafkaeventspringboot.events.dto.Person;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

public class GenericCustomPersonEvent extends GenericCustomEvent<Person> {

    public GenericCustomPersonEvent(final Object source, final Person what) {
        super(source, what);
    }

}