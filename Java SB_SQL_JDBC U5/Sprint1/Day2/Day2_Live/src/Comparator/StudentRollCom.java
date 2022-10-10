package Comparator;

import java.util.Comparator;

public class StudentRollCom implements Comparator<StudentCOMTOR> {

    @Override
    public int compare(StudentCOMTOR o1, StudentCOMTOR o2) {
        return o1.getRoll()>o2.getRoll() ? +1 : -1 ;
    }
}
