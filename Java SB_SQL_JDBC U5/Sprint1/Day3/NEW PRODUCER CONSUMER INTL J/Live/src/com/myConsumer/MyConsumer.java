package com.myConsumer;

import com.mypredicate.Student;

import java.util.function.Consumer;

public class MyConsumer implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println("Welcome--> "+s);
    }
}


1:20