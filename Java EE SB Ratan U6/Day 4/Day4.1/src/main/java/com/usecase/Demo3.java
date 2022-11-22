package com.usecase;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.util.EMUtil;

public class Demo3
{
	public static void main(String[] args)
	{
		EntityManager em1 = EMUtil.proviEntityManager();

		String jpql1 = "update Account set balance=balance+500";

		Query query = em1.createQuery(jpql1);

		em1.getTransaction().begin();

		int x = query.executeUpdate();

		em1.getTransaction().commit();

		System.out.println(x + " row updated...");

		em1.close();

	}
}
