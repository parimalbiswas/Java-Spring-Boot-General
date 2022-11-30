package com.dao;

public class ServiceBean
{
	private DaoBean dao;

	public DaoBean getDao()
	{
		return dao;
	}

	public void setDao(DaoBean dao)
	{
		this.dao = dao;
	}

	public void calculateInterest()
	{
		dao.findAccount();

		System.out.println("Interest is calculated in ServiceBean Class");

	}

}
