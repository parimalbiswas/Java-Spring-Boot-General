package com.parimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A
{
	@Autowired
	private B b1;

	public void funA()
	{
		System.out.println("Inside funA of A");
		b1.funB();
	}
}
