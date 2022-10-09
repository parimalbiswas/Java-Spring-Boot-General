package com.oct7.comparatorExample;

import com.oct7.Student;

import java.util.Comparator;

public class StudentMarksComp implements Comparator<Student_1C> {


    //IF ONLY MARKS NEED TO SORT
//    @Override
//    public int compare(Student_1C o1, Student_1C o2) {
//        return o1.getMarks()>o2.getMarks() ? +1 : -1 ;
//    }


    //IF ONLY MARKS NEED TO SORT -- IF MARKS SAME SORT WITH NAME
    @Override
    public int compare(Student_1C s1, Student_1C s2) {
        if (s1.getMarks() > s2.getMarks())
        {
            return 1;
        }
        else if (s1.getMarks()<s2.getMarks()) {
            return -1;
        }
        else {
            return s1.getName().compareTo(s2.getName());
        }
    }

}
