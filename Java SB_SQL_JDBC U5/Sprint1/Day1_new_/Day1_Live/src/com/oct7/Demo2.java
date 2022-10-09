package com.oct7;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Demo2 {
    public static void main(String[] args) {

        //From List Remove Duplicates

        List<Student> students = new ArrayList<>();
        students.add(new Student(10,"N1",780));
        students.add(new Student(20,"N2",750));
        //students.add(new Student(10,"N3",780));
        students.add(new Student(50,"N4",70));
        students.add(new Student(110,"N5",790));
        students.add(new Student(10,"N1",780));

        System.out.println(students.size());  //5
        // lIST TO SET
        Set<Student> uniqueStudents  = new LinkedHashSet<>(students);

        System.out.println(uniqueStudents.size()); //4

        // SET to LIST
        students = new ArrayList<>(uniqueStudents);

        System.out.println(students.size());





    }
}
