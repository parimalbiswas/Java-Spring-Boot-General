package com.dao;

import javax.persistence.EntityManager;

import com.model.Account;
import com.util.EMUtil;

public class AccountDaoImpl implements AccountDao
{

	@Override
	public boolean createAccount(Account account)
	{
		boolean flag = false;

		EntityManager em1 = EMUtil.proviEntityManager();

		em1.getTransaction().begin();

		em1.persist(account);
		flag = true;

		em1.getTransaction().commit();

		em1.close();

		return flag;
	}

	@Override
	public boolean deleteAccount(int accno)
	{
		boolean flag = false;

		EntityManager em1 = EMUtil.proviEntityManager();

		em1.getTransaction().begin();

		Account account = em1.find(Account.class, accno);

		if (account != null)
		{
			em1.remove(account);
			flag = true;
		}

		em1.getTransaction().commit();

		em1.close();

		return flag;
	}

	@Override
	public boolean updateAccount(Account account)
	{
		boolean flag = false;

		EntityManager em1 = EMUtil.proviEntityManager();

		Account isExistaccount = em1.find(Account.class, account.getAccno());

		if (isExistaccount != null)
		{
			em1.getTransaction().begin();

			em1.merge(account);
			flag = true;

			em1.getTransaction().commit();

		}
		else
		{
			throw new IllegalArgumentException("Invalid account");
		}

		em1.close();

		return flag;
	}

	@Override
	public Account findAccount(int accno)
	{
		Account account = null;

		EntityManager em1 = EMUtil.proviEntityManager();

		account = em1.find(Account.class, accno);

		return account;

		// return EMUtil.proviEntityManager().find(Account.class, accno);

	}

}
