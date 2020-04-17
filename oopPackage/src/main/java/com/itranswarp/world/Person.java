package com.itranswarp.world;

/**
 * @program: small
 * @description:
 * @author: syj
 * @create: 2020-04-17 07:49
 **/
public class Person {

    String name;

    public Person(String name) {
        this.name = name;
    }

    public String hello() {
        return "Hello, " + this.name;
    }
}
