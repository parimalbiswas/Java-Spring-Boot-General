package com.Topic1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> list = new ArrayList<>();
		list.add(new Student(1, "N1", 100));
		list.add(new Student(7, "N2", 500));
		list.add(new Student(6, "N3", 300));
		list.add(new Student(18, "N4", 900));
		list.add(new Student(9, "N5", 320));

		// USing Annonimous innerr Class
		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				// TODO Auto-generated method stub
				return s1.getMarks() > s2.getMarks() ? +1 : -1;
			}

		});

		// Using Lamda Exp
		Collections.sort(list, (s1, s2) -> s1.getMarks() > s2.getMarks() ? +1 : -1);

	}

}
