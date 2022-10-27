package com.myConsumr;

import java.util.function.Consumer;

public class MyConsumer implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println("Welcome--> "+s);
    }
}


