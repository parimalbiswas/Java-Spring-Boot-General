package com.abc1;

public class B
{
	A a1;

	public B(A a1)
	{
		super();
		this.a1 = a1;
	}

	public B()
	{
		super();
	}

	public void showB()
	{
		System.out.println("Inside showB of B");

		System.out.println("A object us ==> " + a1);
	}

}
