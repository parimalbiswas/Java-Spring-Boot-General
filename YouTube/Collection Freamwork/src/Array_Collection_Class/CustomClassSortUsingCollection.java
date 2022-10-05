package Array_Collection_Class;

import hascodeEqual.Student;

import java.util.*;

public class CustomClassSortUsingCollection {

    public static void main(String[] args) {
        Set<Student1Coll> set = new HashSet<>();

        set.add(new Student1Coll("Pari",21));
        set.add(new Student1Coll("Mal",5));
        set.add(new Student1Coll("xxx",6));
        set.add(new Student1Coll("ooo",9));
        set.add(new Student1Coll("kkk",5));



        Student1Coll s1 = new Student1Coll("Pari",2);
        Student1Coll s2 = new Student1Coll("Pari",3);

        System.out.println((s1.compareTo(s2)));



        //Internally Happing comapare to inside of Collection.sort
        List<Student1Coll> set1 = new ArrayList<>();
        set1.add(new Student1Coll("Pari",21));
        set1.add(new Student1Coll("Mal",5));
        set1.add(new Student1Coll("xxx",6));
        set1.add(new Student1Coll("ooo",9));
        set1.add(new Student1Coll("kkk",5));

        Collections.sort(set1);
        System.out.println(set1);
    }
}
