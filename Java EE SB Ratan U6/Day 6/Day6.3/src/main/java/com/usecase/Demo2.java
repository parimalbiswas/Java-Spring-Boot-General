package com.usecase;

import javax.persistence.EntityManager;

import com.util.EMUtil;

public class Demo2
{

	public static void main(String[] args)
	{
		EntityManager em1 = EMUtil.proviEntityManager();

		em1.close();
		System.out.println("Done....");

	}
}
