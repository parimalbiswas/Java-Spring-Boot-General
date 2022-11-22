package com.usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.util.EMUtil;

public class Demo7
{
	public static void main(String[] args)
	{
		EntityManager em1 = EMUtil.proviEntityManager();

		String jpql1 = "select balance from Account";

		TypedQuery<Integer> query = em1.createQuery(jpql1, Integer.class);

		List<Integer> balancelist = query.getResultList();

		balancelist.forEach(s -> System.out.println(s));

	}
}
