package com.parimal;

public class Travel
{
	private Vehicle vehicle;

	public void setVehicle(Vehicle vehicle)
	{
		this.vehicle = vehicle;
	}

//	public Travel(Vehicle vehicle)
//	{
//		super();
//		this.vehicle = vehicle;
//	}
//
//	public Travel()
//	{
//		super();
//	}
//	

	public void journey()
	{
		vehicle.go();
	}

}
