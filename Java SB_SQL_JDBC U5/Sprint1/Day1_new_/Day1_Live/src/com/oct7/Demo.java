package com.oct7;

import java.util.*;

public class Demo
{

    public List<Student> getStudentList(){
        // If I use List Here Both Will Work

//        ArrayList<Student> studentsX = new ArrayList<>();
//        studentsX.add(new Student(10,"N1",780));
//        studentsX.add(new Student(20,"N2",780));
//        studentsX.add(new Student(10,"N3",780));
//        return studentsX;



        LinkedList<Student> studentsY = new LinkedList<>();
        studentsY.add(new Student(10,"N1",780));
        studentsY.add(new Student(20,"N2",780));
        studentsY.add(new Student(10,"N3",780));
        return studentsY;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        List<Student> students = new ArrayList<>(); // Best for use
//
//        ArrayList<Student> students1 = new ArrayList<>(); //Too much Specific

//        Collections student3 = new ArrayList<>();

        Object student4 = new ArrayList<>(); //Too much generic
        ArrayList<Student> al = (ArrayList<Student>) student4; // DownCasting


    }
}
