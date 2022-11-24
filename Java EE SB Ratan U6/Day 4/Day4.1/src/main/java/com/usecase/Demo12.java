package com.usecase;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.util.EMUtil;

public class Demo12
{
	public static void main(String[] args)
	{
		EntityManager em1 = EMUtil.proviEntityManager();

		String jpql = "select sum(balance) from Account";

		TypedQuery<Long> query = em1.createQuery(jpql, Long.class);

		long result = query.getSingleResult();

		System.out.println(result);

		em1.close();
	}
}
