package com.model;

import javax.persistence.Entity;

@Entity
public class ContractualEmployee extends Employee
{
	private int noOfWorkingDays;
	private int costPerDay;

	public int getNoOfWorkingDays()
	{
		return noOfWorkingDays;
	}

	public void setNoOfWorkingDays(int noOfWorkingDays)
	{
		this.noOfWorkingDays = noOfWorkingDays;
	}

	public int getCostPerDay()
	{
		return costPerDay;
	}

	public void setCostPerDay(int costPerDay)
	{
		this.costPerDay = costPerDay;
	}

	@Override
	public String toString()
	{
		return "ContractualEmployee [noOfWorkingDays=" + noOfWorkingDays + ", costPerDay=" + costPerDay + "]";
	}

}
