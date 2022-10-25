package com.mypredicate.Topic1;

import com.mypredicate.Student;
import com.mypredicate.Topic1.MyPredicateStd;

import java.util.function.Predicate;

public class Demo2 {
    public static void main(String[] args) {
        Predicate<Student> p2 = new MyPredicateStd();
        System.out.println(p2.test(new Student(11,"n2",500)));
        System.out.println(p2.test(new Student(10,"n1",800)));


        System.out.println("------------------------------");

        Predicate<Student> p3 = e -> e.getMarks() > 700;
        System.out.println(p3.test(new Student(5,"j1",600)));
        System.out.println(p3.test(new Student(5,"j1",900)));


    }
}
