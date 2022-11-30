package com.abc1;

public class A
{
	B b1;

	public void setB1(B b1)
	{
		this.b1 = b1;
	}

//	public A(B b1)
//	{
//		super();
//		this.b1 = b1;
//	}
//
//	public A()
//	{
//		super();
//	}

	public void showA()
	{
		System.out.println("inside showA of A");

		System.out.println("B obj is ==> " + b1);
	}

}
