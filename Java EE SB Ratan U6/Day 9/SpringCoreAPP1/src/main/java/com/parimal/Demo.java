package com.parimal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo
{
	public static void main(String[] args)
	{
		ApplicationContext contx1 = new ClassPathXmlApplicationContext("applicationContext.xml");

		Travel travel = contx1.getBean("tr", Travel.class);

		travel.journey();

	}
}
