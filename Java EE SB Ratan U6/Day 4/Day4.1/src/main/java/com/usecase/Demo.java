package com.usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.model.Account;
import com.util.EMUtil;

//import antlr.collections.List;

public class Demo
{

	public static void main(String[] args)
	{
		EntityManager em1 = EMUtil.proviEntityManager();

		Query query = em1.createQuery("from Account");

		List<Account> list = query.getResultList();

		list.forEach(s -> System.out.println(s));

		em1.close();
	}
}
