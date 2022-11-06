package com.model;

public class StudentCourseDTO
{
	private int roll;
	private String name;
	private String address;
	private String email;

	private String cname;
	private String duration;

	public StudentCourseDTO()
	{

	}

	public StudentCourseDTO(int roll, String name, String address, String email, String cname, String duration)
	{
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.email = email;
		this.cname = cname;
		this.duration = duration;
	}

	public int getRoll()
	{
		return roll;
	}

	public void setRoll(int roll)
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

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getCname()
	{
		return cname;
	}

	public void setCname(String cname)
	{
		this.cname = cname;
	}

	public String getDuration()
	{
		return duration;
	}

	public void setDuration(String duration)
	{
		this.duration = duration;
	}

	@Override
	public String toString()
	{
		return "StudentCourseDTO [roll=" + roll + ", name=" + name + ", address=" + address + ", email=" + email
				+ ", cname=" + cname + ", duration=" + duration + "]";
	}

}
