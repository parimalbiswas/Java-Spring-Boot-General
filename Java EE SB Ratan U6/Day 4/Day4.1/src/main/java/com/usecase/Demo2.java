package com.usecase;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.model.Account;
import com.util.EMUtil;

public class Demo2
{

	public static void main(String[] args)
	{
		EntityManager em1 = EMUtil.proviEntityManager();
		String jpql = "from Account where name='Jio'";

		Query query = em1.createQuery(jpql);

//		List<Account> accounts = query.getResultList();
//		accounts.forEach(s -> System.out.println(s));

		Account account = (Account) query.getSingleResult();
		System.out.println(account);

	}
}
