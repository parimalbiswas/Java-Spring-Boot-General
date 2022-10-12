package com.Topic1;

//LE as a method parameter
public class Demo2 {

	void fun1(Intr i1) {
		if (i1 != null) {
			System.out.println("inside Demo1");

			i1.printSomeThing("Amit");
		} 
		else 
		{
			System.out.println("Get Lost");
		}

	}

	public static void main(String[] args) {

		Demo2 demo2 = new Demo2();
//		demo2.fun1(null);
//		
//		
//		demo2.fun1(new IntrImpl());
		
		Intr i1 = s-> System.out.println("Welcome LE: "+s);
		demo2.fun1(i1);
		

	}
}
