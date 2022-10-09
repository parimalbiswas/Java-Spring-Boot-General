package com.oct7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(10,"N1",780));
        students.add(new Student(20,"N2",750));
        //students.add(new Student(10,"N3",780));
        students.add(new Student(50,"N4",70));
        students.add(new Student(110,"N5",790));
        students.add(new Student(10,"N1",780));

        System.out.println(students.size());



        //Object physically never be equal
        //to make Logically equal we need to override has code and equals

        Set<Student> studentsHS = new HashSet<>();
        studentsHS.add(new Student(10,"N1",780));
        studentsHS.add(new Student(20,"N2",750));
        //students.add(new Student(10,"N3",780));
        studentsHS.add(new Student(50,"N4",70));
        studentsHS.add(new Student(110,"N5",790));
        studentsHS.add(new Student(10,"N1",780));

        System.out.println(studentsHS.size());
    }
}
