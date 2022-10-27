package com.myConsumr;

import java.util.function.Consumer;

public class DemoC {
    public static void main(String[] args) {
        Consumer<String> c1 = new MyConsumer();
        c1.accept("Ravi");

        Consumer<String> c2 = s -> System.out.println("Welcome LE=:>"+s);
        c2.accept("Parimal");
    }
}
