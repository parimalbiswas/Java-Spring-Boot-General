package com.usecase;

import java.util.Scanner;

import com.dao.AccountDao;
import com.dao.AccountDaoImpl;
import com.model.Account;

public class Withdrawl_usecase
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Account Number");
		int accno = scanner.nextInt();

		AccountDao dao = new AccountDaoImpl();
		Account account = dao.findAccount(accno);

		if (account == null)
		{
			System.out.println("Account Not Exist...");
		}
		else
		{
			System.out.println("Enter the Amount to Withdraw..");
			int amount = scanner.nextInt();

			if (amount <= account.getBalance())
			{
				account.setBalance(account.getBalance() - amount);

				boolean f = dao.updateAccount(account);

				if (f)
				{
					System.out.println("Withdrawl Succsfull.......");
				}
				else
				{
					System.out.println("Technical Error........");
				}
			}
			else
			{
				System.out.println("Insuffisient Blance");
			}

		}

	}
}
