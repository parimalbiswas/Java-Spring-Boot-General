package com.myConsumr;

import java.util.function.Consumer;

public class MyConsumer2 implements Consumer<Student> {
    @Override
    public void accept(Student s) {
        System.out.println("Roll is "+s.getRoll());
        System.out.println("name is "+s.getName());
        System.out.println("Marks is "+s.getMark());
    }
}
