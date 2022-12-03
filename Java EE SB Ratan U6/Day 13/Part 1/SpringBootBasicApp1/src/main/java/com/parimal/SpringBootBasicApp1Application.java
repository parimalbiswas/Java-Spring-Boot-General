package com.parimal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootBasicApp1Application
{

	public static void main(String[] args)
	{
		ApplicationContext ctx1 = SpringApplication.run(SpringBootBasicApp1Application.class, args);
		A a1 = ctx1.getBean("a", A.class);
		a1.funA();

	}

}
