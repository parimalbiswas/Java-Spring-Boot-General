package com.predicate;

import java.util.ArrayList;
import java.util.List;

public class Demo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(10, "N1", 780));
		students.add(new Student(12, "N2", 480));
		students.add(new Student(13, "N3", 380));
		students.add(new Student(14, "N4", 880));
		students.add(new Student(15, "N5", 680));
		students.add(new Student(16, "N6", 720));
		
		
		students.removeIf( s-> s.getMarks() < 500);
		
		for (Student el : students) {
			System.out.println(el);
		}
		
		

	}

}


lectures/37779
1:19	