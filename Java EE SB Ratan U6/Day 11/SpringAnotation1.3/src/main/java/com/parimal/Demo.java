package com.parimal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Demo
{
	public static void main(String[] args)
	{

		// ClassPathXmlApplicationContext("applicationContext.xml");

		ApplicationContext ctx1 = new AnnotationConfigApplicationContext(AppConfig.class);

		A a1 = ctx1.getBean("a", A.class);
		a1.funA();

		AnnotationConfigApplicationContext cpath1 = (AnnotationConfigApplicationContext) ctx1;

		cpath1.close();
	}
}
