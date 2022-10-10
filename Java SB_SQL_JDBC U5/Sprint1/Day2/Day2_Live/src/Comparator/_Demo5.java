package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _Demo5 {
    public static void main(String[] args) {
        List<StudentCOMTOR> students = new ArrayList<>();
        students.add(new StudentCOMTOR(10,"n1",560));
        students.add(new StudentCOMTOR(11,"n2",20));
        students.add(new StudentCOMTOR(13,"n4",720));
        students.add(new StudentCOMTOR(15,"n6",880));
        students.add(new StudentCOMTOR(12,"n3",180));
        students.add(new StudentCOMTOR(14,"n5",90));

        Collections.sort(students, new StudentMarksComp());
        for (StudentCOMTOR elem : students) {
            System.out.println(elem);
        }
        System.out.println("-------------------------------------------------------------------------------------------------");

        Collections.sort(students, new StudentRollCom());
        for (StudentCOMTOR elem : students) {
            System.out.println(elem);
        }


        System.out.println("-----To find the minimum marks student------");
        // To find the minimum marks student
        StudentCOMTOR studentLOW = Collections.min(students,new StudentMarksComp());
        System.out.println(studentLOW);



        System.out.println("-----To find the max marks student------");
        // To find the maximum marks student
        StudentCOMTOR studentMAX = Collections.max(students,new StudentMarksComp());
        System.out.println(studentMAX);
    }
}
