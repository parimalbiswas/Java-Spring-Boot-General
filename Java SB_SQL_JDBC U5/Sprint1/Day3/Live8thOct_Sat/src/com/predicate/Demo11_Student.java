package com.predicate;

import java.util.function.Predicate;

public class Demo11_Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Student> p1 = new MyPredicateStudent();
		
		System.out.println(p1.test(new Student(10,"Name1",500)));

		
		
		//using LE
		Predicate<Student> p2 = s-> s.getMarks()>700;
		System.out.println(p2.test(new Student(2, "N2", 900)));
		
		
	}

}
