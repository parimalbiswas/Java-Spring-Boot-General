package com.usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.util.EMUtil;

public class Demo8
{
	public static void main(String[] args)
	{
		EntityManager em1 = EMUtil.proviEntityManager();

		String jpql = "select name, balance from Account";

		Query query = em1.createQuery(jpql);

		List<Integer> list1 = query.getResultList();

		list1.forEach(s -> System.out.println(s));

	}
}
