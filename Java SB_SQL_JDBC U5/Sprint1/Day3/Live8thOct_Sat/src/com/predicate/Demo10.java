package com.predicate;

import java.util.function.Predicate;

public class Demo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> p1 = new MyPredicate();
		System.out.println(p1.test(10));
		System.out.println(p1.test(-10));
		
		System.out.println("---------------");
		
		//Using LE
		Predicate<Integer> p2 = i -> i>=0;
		System.out.println(p2.test(10));

	}

}
