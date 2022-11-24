package com.usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.model.Account;
import com.util.EMUtil;

public class Demo13
{
	public static void main(String[] args)
	{

		EntityManager em1 = EMUtil.proviEntityManager();

		Query query = em1.createNamedQuery("account.getBalanceLessThanX");

		query.setParameter("bal", 5900);

		List<Account> accounts = query.getResultList();

		for (Account element1 : accounts)
		{
			System.out.println(element1);
		}

	}
}
