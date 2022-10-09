package com.oct7;

import java.util.TreeSet;

public class Demo3 {
    public static void main(String[] args) {
        //TreeSet is Sorted Order
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(10);
        ts.add(20);
        ts.add(30);
        ts.add(40);
        ts.add(50);
        ts.add(10);
        System.out.println(ts);

        TreeSet<String> ts2 = new TreeSet<>();
        ts2.add("one");
        ts2.add("two");
        ts2.add("three");
        ts2.add("four");
        System.out.println(ts2);


        // TreeSet whatever Object type we define inside Treeset that class should extend Comparable class
        TreeSet<Student> ts3 = new TreeSet<>();
        ts3.add(new Student(10,"N1",780));
        ts3.add(new Student(20,"N2",750));
        //students.add(new Student(10,"N3",780));
        ts3.add(new Student(50,"N4",70));
        ts3.add(new Student(110,"N5",790));
        ts3.add(new Student(10,"N1",780));
        ts3.add(new Student(10,"n6",780));

        //System.out.println(ts3);
        System.out.println(ts3.size());

//        Note: all the Wrapper classes and String class internally implements
//                Comparable interface.

//        Note: to consider the duplicate element, HashSet and LinkedHashSet
//        class uses equal() and hashCode() method internally,
//        where as TreeSet class uses compareTo or compare() method.

        for (Student elem : ts3) {
            System.out.println(elem);
        }


    }
}
