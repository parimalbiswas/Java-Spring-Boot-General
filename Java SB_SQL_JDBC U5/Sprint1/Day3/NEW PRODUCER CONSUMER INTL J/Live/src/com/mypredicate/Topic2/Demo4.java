package com.mypredicate.Topic2;

import com.mypredicate.Student;

import java.util.ArrayList;
import java.util.List;

public class Demo4 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(10,"n1",900));
        students.add(new Student(12,"n3",630));
        students.add(new Student(13,"n4",860));
        students.add(new Student(12,"n3",390));
        students.add(new Student(12,"n3",770));


       // students.removeIf(new MyPredicate1());

        students.removeIf(s-> s.getMarks() < 700);

        for (Student el : students) {
            System.out.println(el);
        }




    }
}
