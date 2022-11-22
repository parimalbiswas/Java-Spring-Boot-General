package com.usecase;

import com.dao.AccountDao;
import com.dao.AccountDaoImpl;
import com.model.Account;

public class CreateAccount_usecase
{
	public static void main(String[] args)
	{

		AccountDao dao = new AccountDaoImpl();

		Account account = new Account();
		account.setName("Jio");
		account.setBalance(7745);

		boolean yesno = dao.createAccount(account);

		if (yesno)
		{
			System.out.println("Account Created sucess.....");
		}
		else
		{
			System.out.println("Not created faild...");
		}

	}
}
