package com.oct7.comparatorExample;

import com.oct7.Student;

import java.util.TreeSet;

public class Demo4 {
    public static void main(String[] args) {

        StudentMarksComp mcomp =  new StudentMarksComp();

        StudentRollComp rcomp = new StudentRollComp();

        TreeSet<Student_1C> ts3 = new TreeSet<>(rcomp);

        ts3.add(new Student_1C(10,"N1",780));
        ts3.add(new Student_1C(20,"N2",750));
        //students.add(new Student(10,"N3",780));
        ts3.add(new Student_1C(50,"N4",70));
        ts3.add(new Student_1C(110,"N5",790));
        ts3.add(new Student_1C(10,"N1",780));
        ts3.add(new Student_1C(10,"n6",780));

        System.out.println(ts3.size());

        for (Student_1C elem : ts3) {
            System.out.println(elem);
        }


    }
}
