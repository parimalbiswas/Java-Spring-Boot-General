package com.oct7;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student(10,"N1",500);
        Student s2 = new Student(10,"N1",500);

        System.out.println(s1.equals(s2));
    }
}
