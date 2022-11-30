package com.abc1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo
{
	public static void main(String[] args)
	{
		ApplicationContext ctx1 = new ClassPathXmlApplicationContext("applicationContext.xml");

		A a1 = ctx1.getBean("aobj", A.class);

		a1.showA();

	}
}
