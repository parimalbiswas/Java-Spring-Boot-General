package com.parimal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Demo
{
	public static void main(String[] args)
	{
		ApplicationContext ctx1 = new ClassPathXmlApplicationContext("applicationContext.xml");

		A a1 = ctx1.getBean("a", A.class);
		a1.funA();

		ClassPathXmlApplicationContext cpath1 = (ClassPathXmlApplicationContext) ctx1;
		cpath1.close();
	}
}
