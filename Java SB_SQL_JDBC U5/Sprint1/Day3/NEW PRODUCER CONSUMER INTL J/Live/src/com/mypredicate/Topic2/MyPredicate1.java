package com.mypredicate.Topic2;

import com.mypredicate.Student;

import java.util.function.Predicate;

public class MyPredicate1 implements Predicate<Student> {
    @Override
    public boolean test(Student student) {
        return student.getMarks() > 700;
    }
}
