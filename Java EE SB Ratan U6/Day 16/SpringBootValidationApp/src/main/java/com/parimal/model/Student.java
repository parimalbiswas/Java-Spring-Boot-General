package com.parimal.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Student
{
	@NotNull(message = "{roll.invalid}") // coming from proparties file
	@Min(value = 10, message = "Roll must be starts from 10")
	private Integer roll;
	@Size(min = 3, max = 10, message = "{name.invalid}")
	private String name;

	private String address;
	@NotNull(message = "marks is mandatory")
	@Min(value = 40, message = "marks should be above 40")
	private Integer marks;

	public Student()
	{

	}

	public Student(Integer roll, String name, String address, Integer marks)
	{
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.marks = marks;
	}

	public Integer getRoll()
	{
		return roll;
	}

	public void setRoll(Integer roll)
	{
		this.roll = roll;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public Integer getMarks()
	{
		return marks;
	}

	public void setMarks(Integer marks)
	{
		this.marks = marks;
	}

	@Override
	public String toString()
	{
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + ", marks=" + marks + "]";
	}

}
