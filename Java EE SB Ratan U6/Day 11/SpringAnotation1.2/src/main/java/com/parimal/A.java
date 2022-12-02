package com.parimal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class A
{
	@Autowired
	@Qualifier(value = "b2")
	private B b1;

	@Autowired
	private Student s1;

	@Autowired
	@Qualifier(value = "getNames")
	List<String> cities;

	public void funA()
	{
		System.out.println("inside funA of A");
		System.out.println(b1);

		System.out.println(cities);

		System.out.println(s1);
	}
}
