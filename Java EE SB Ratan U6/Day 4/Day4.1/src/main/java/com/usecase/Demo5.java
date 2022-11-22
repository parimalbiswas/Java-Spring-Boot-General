package com.usecase;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.model.Account;
import com.util.EMUtil;

public class Demo5
{
	public static void main(String[] args)
	{
		EntityManager em1 = EMUtil.proviEntityManager();

		String jpql1 = "from Account where name='Jio'";

		TypedQuery<Account> query = em1.createQuery(jpql1, Account.class);

		Account account = query.getSingleResult();

		System.out.println(account);

		em1.close();

	}
}
