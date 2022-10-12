package com.predicate;

import java.util.function.Predicate;

public class MyPredicate implements Predicate<Integer>{

	@Override
	public boolean test(Integer i) {
		// TODO Auto-generated method stub
		return i>=0;
	}

}
