package com.oct7.comparatorExample;

import java.util.Comparator;

public class StudentRollComp implements Comparator<Student_1C>
{

    @Override
    public int compare(Student_1C o1, Student_1C o2)
    {
        return o1.getRoll()>o2.getRoll() ? 1 : -1;
    }
}
