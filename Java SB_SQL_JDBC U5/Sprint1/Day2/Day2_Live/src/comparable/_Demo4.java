package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class _Demo4 {
    public static void main(String[] args) {
        List<StudentCOMABLE> students = new ArrayList<>();
        students.add(new StudentCOMABLE(10,"n1",560));
        students.add(new StudentCOMABLE(11,"n2",20));
        students.add(new StudentCOMABLE(13,"n4",720));
        students.add(new StudentCOMABLE(15,"n6",880));
        students.add(new StudentCOMABLE(12,"n3",180));
        students.add(new StudentCOMABLE(14,"n5",90));

        //------------METHOD 1 --------------
        //Automatic Sort using TreeSet
        TreeSet<StudentCOMABLE> ts = new TreeSet<>(students);
        System.out.println(ts);

        for (StudentCOMABLE elem : ts) {
            System.out.println(elem);
        }


        //-------------------------------------------------------
        System.out.println("----------------------------------------");
        //-------------------------------------------------------


        //------------METHOD 2 --------------
        Collections.sort(students);
        System.out.println(students);

        for (StudentCOMABLE elem : students) {
            System.out.println(elem);
        }
    }
}
