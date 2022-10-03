package hascodeEqual;

import java.util.HashSet;
import java.util.Set;

public class HasSetFunction {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();

        set.add(new Student("Pari",2));
        set.add(new Student("Mal",5));
        set.add(new Student("xxx",6));
        set.add(new Student("ooo",9));
        set.add(new Student("kkk",5));

        System.out.println(set);
    }
}
