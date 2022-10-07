import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class _5 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();


        students.add(new Student(10,"n1",750));
        students.add(new Student(1,"n2",950));
        students.add(new Student(8,"n3",250));
        students.add(new Student(20,"n4",550));
        students.add(new Student(50,"n5",350));
        students.add(new Student(90,"n6",150));


        //Collections.sort();

        TreeSet<Student> ts = new TreeSet<>(students);
        

    }
}
