package com.Topic1;

public class Demo3 {
	
	Intr fun1()
	{
		System.out.println("Inside fun1 of Demo");
		
		return s->System.out.println(s);
	}

	public static void main(String[] args) 
	{
		Demo3 demo3 = new Demo3();
		Intr i2 = demo3.fun1();
		
		

	}

}
