package com.usecase;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.util.EMUtil;

public class Demo6
{
	public static void main(String[] args)
	{
		EntityManager em1 = EMUtil.proviEntityManager();

		String jpql1 = "select a.name from Account a where a.accno=:ano";

		TypedQuery<String> query = em1.createQuery(jpql1, String.class);
		query.setParameter("ano", 4);

		String name = query.getSingleResult();
		System.out.println("name is : " + name);

		em1.close();
	}
}
