package com.parimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class A
{
//	@Value("${id}")
//	private int id;
//	@Value("${name}")
//	private String name;
//	@Value("${salary}")
//	private int salary;

	@Autowired
	private Environment env;

	public void funA()
	{
		System.out.println("inside funA of A");

//		System.out.println(id);
//		System.out.println(name);
//		System.out.println(salary);

		System.out.println(env.getProperty("id"));
		System.out.println(env.getProperty("name"));
		System.out.println(env.getProperty("salary"));

	}
}
