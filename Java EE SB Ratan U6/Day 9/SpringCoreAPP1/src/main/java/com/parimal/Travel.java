package com.parimal;

public class Travel
{
	// user defined Object
	private Vehicle vehicle;

	// Simple Value Type Object
	private int noOfPerson;

	// Setter Injection Point
	public void setVehicle(Vehicle vehicle)
	{
		this.vehicle = vehicle;
	}

	// Setter Injection Point
	public void setNoOfPerson(int noOfPerson)
	{
		this.noOfPerson = noOfPerson;
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
		System.out.println("Journey Started...");
		System.out.println("Number Of Person ==> " + noOfPerson);
	}

}
