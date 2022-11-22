package com.usecase;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.util.EMUtil;

public class Demo4
{

	public static void main(String[] args)
	{
		EntityManager em1 = EMUtil.proviEntityManager();

		String jpql1 = "update Account set balance=balance+:bal where name=:nm";

		Query query = em1.createQuery(jpql1);

		query.setParameter("bal", 1000);
		query.setParameter("nm", "Ramesh");

		em1.getTransaction().begin();

		int x = query.executeUpdate();

		em1.getTransaction().commit();

		System.out.println(x + " Record Updated");

		em1.close();

	}
}
