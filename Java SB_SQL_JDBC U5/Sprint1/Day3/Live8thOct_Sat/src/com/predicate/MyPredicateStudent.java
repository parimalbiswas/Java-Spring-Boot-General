package com.predicate;

import java.util.function.Predicate;

public class MyPredicateStudent implements Predicate<Student>{

	@Override
	public boolean test(Student s) {
		// TODO Auto-generated method stub
		return s.getMarks() > 700;
	}

}
