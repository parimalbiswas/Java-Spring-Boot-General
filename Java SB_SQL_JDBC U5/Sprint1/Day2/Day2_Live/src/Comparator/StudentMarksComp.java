package Comparator;

import java.util.Comparator;

public class StudentMarksComp implements Comparator<StudentCOMTOR> {


    @Override
    public int compare(StudentCOMTOR s1, StudentCOMTOR s2) {
        return s1.getMarks()>s2.getMarks() ? +1 : -1;
    }
}
