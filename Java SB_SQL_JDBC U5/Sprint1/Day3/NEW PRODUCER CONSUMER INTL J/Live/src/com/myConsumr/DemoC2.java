package com.myConsumr;

import java.util.function.Consumer;

public class DemoC2 {
    public static void main(String[] args) {
        Consumer<Student> c1 = new MyConsumer2();
        c1.accept(new Student(10,"n1",500));

        System.out.println("---------");

        Consumer<Student> c2 = s -> {

            System.out.println("Roll is "+s.getRoll());
            System.out.println("name is "+s.getName());
            System.out.println("Marks is "+s.getMark());
        };
        c2.accept(new Student(5,"m5",100));

    }
}
