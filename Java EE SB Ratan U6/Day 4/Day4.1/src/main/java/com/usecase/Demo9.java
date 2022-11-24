package com.usecase;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.util.EMUtil;

public class Demo9
{
	public static void main(String[] args)
	{
		EntityManager em1 = EMUtil.proviEntityManager();

		String jpql1 = "select balance from Account where accno =:ano";

//		Query query = em1.createQuery(jpql1);
//		
//		query.setParameter("ano", 5);
//
//		int bal1 = (int) query.getSingleResult();

//		System.out.println(bal1);

		TypedQuery<Integer> query = em1.createQuery(jpql1, Integer.class);

		query.setParameter("ano", 5);

		int bal2 = query.getSingleResult();

		System.out.println(bal2);

	}
}
