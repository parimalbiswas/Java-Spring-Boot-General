package com.dao;

public class PresentationBean
{

	private ServiceBean service;

	public ServiceBean getService()
	{
		return service;
	}

	public void setService(ServiceBean service)
	{
		this.service = service;
	}

	public void present()
	{
		service.calculateInterest();
		System.out.println("Calculated Interest is Presented By the Presebtation Bean");

	}

}
