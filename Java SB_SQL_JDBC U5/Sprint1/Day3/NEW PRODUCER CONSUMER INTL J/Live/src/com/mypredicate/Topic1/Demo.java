package com.mypredicate.Topic1;

import java.util.function.Predicate;

public class Demo {
    public static void main(String[] args) {
        Predicate<Integer> p1 = new MyPredicate();
        System.out.println(p1.test(-10));

        Predicate<Integer> p2 = i -> { return i>=0; };
        System.out.println(p2.test(10));

    }
}
