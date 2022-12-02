package com.parimal;

import org.springframework.stereotype.Component;

@Component(value = "b2")
public class B
{
	public void funB()
	{
		System.out.println("Inside showB of B");
	}
}
