package com.usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.util.EMUtil;

public class Demo10
{
	public static void main(String[] args)
	{
		EntityManager em1 = EMUtil.proviEntityManager();

		String jpql = "select name, balance from Account";

		Query query = em1.createQuery(jpql);

		List<Object[]> list = query.getResultList();

		for (Object[] objects : list)
		{
			String name = (String) objects[0];

			Integer balance = (Integer) objects[1];

			System.out.println("Name is--" + name);
			System.out.println("Balance is---" + balance);

			System.out.println("===========================");
		}

	}
}
