package com.mySupplier;

import java.util.function.Supplier;

public class DemoS1 {
    public static void main(String[] args) {
        Supplier<String> s1 = new MySupplier();

        String str = s1.get();
        System.out.println(str);

        System.out.println("-----------LE------------");


        Supplier<String> s2 = () -> "Return Jio from LE";
        System.out.println( s2.get());

        System.out.println("------------------");

        Supplier<Student> s3 = ()-> new Student(10,"m1",100);
        System.out.println(s3.get());

    }
}
