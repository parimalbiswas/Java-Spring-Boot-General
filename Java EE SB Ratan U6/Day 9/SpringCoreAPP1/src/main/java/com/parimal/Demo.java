package com.parimal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo
{
	public static void main(String[] args)
	{
		ApplicationContext contx1 = new ClassPathXmlApplicationContext("applicationContext.xml");

		Travel travel1 = contx1.getBean("tr11", Travel.class);

		travel1.journey();

//		Travel travel2 = contx1.getBean("tr2", Travel.class);
//
//		travel2.journey();

	}
}
