package com.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo
{
	public static void main(String[] args)
	{
		ApplicationContext contx1 = new ClassPathXmlApplicationContext("applicationContext.xml");

		PresentationBean pbean = contx1.getBean("pb", PresentationBean.class);

		pbean.present();
	}
}
