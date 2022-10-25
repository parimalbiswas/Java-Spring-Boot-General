package com.mypredicate.Topic1;

import com.mypredicate.Student;

import java.util.function.Predicate;

public class MyPredicateStd implements Predicate<Student> {
    @Override
    public boolean test(Student s) {
       return s.getMarks() > 700;
    }
}
