package com.parimal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo
{
	public static void main(String[] args)
	{
		ApplicationContext contx1 = new ClassPathXmlApplicationContext("applicationContext.xml");

		MyBusinessClass obj1 = contx1.getBean("mb", MyBusinessClass.class);

		obj1.fun1();

	}
}
