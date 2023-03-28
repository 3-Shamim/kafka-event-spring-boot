package com.learningstuff.kafkaeventspringboot.events.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Person {

    private String name;
    private int age;

}
