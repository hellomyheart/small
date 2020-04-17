package com.itranswarp.sample;

import com.itranswarp.world.Person;

/**
 * @program: small
 * @description:
 * @author: syj
 * @create: 2020-04-17 07:48
 **/
public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("小明");
        System.out.println(p1.hello());
    }

}
