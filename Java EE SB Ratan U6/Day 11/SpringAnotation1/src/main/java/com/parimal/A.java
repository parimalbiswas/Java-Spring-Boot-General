package com.parimal;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "a")
public class A
{
	@Autowired
	@Qualifier(value = "b5")
	private B b1;

	@PostConstruct
	public void mySetUp()
	{
		System.out.println("Inside MysetUp .......");
	}

	@PreDestroy
	public void destroy()
	{
		System.out.println("Inside Destroy.....");
	}

	public void funA()
	{
		System.out.println("inside funA of A");
		System.out.println(b1);
	}
}
