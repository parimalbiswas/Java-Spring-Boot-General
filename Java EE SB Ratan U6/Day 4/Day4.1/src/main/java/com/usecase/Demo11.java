package com.usecase;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.util.EMUtil;

public class Demo11
{
	public static void main(String[] args)
	{
		EntityManager em1 = EMUtil.proviEntityManager();

		String jpql = "select name, balance from Account where accno=:ano";

//		Query query = em1.createQuery(jpql);
//		query.setParameter("ano", 5);
//		Object[] result1 = (Object[]) query.getSingleResult();

		TypedQuery<Object[]> query = em1.createQuery(jpql, Object[].class);
		query.setParameter("ano", 5);
		Object[] result1 = query.getSingleResult();

		System.out.println("Name is => " + ((String) result1[0]).toUpperCase());
		System.out.println("Balance is => " + (Integer) result1[1]);

		em1.close();

	}
}
