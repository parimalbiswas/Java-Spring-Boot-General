package com.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	private String name;
	private int salary;

	@Embedded
	@AttributeOverrides(
	{ @AttributeOverride(name = "state", column = @Column(name = "HOME_STATE")),
			@AttributeOverride(name = "city", column = @Column(name = "HOME_CITY")),
			@AttributeOverride(name = "pincode", column = @Column(name = "HOME_PINCODE")),

	})
	private Address homeAddress;

	@Embedded
	@AttributeOverrides(
	{ @AttributeOverride(name = "state", column = @Column(name = "OFFICE_STATE")),
			@AttributeOverride(name = "city", column = @Column(name = "OFFICE_CITY")),
			@AttributeOverride(name = "pincode", column = @Column(name = "OFFICE_PINCODE")),

	})
	private Address officeaddress;

	public Employee()
	{
		super();
	}

	public Employee(String name, int salary, Address homeAddress, Address officeaddress)
	{
		super();
		this.name = name;
		this.salary = salary;
		this.homeAddress = homeAddress;
		this.officeaddress = officeaddress;
	}

	public int getEid()
	{
		return eid;
	}

	public void setEid(int eid)
	{
		this.eid = eid;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getSalary()
	{
		return salary;
	}

	public void setSalary(int salary)
	{
		this.salary = salary;
	}

	public Address getHomeAddress()
	{
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress)
	{
		this.homeAddress = homeAddress;
	}

	public Address getOfficeaddress()
	{
		return officeaddress;
	}

	public void setOfficeaddress(Address officeaddress)
	{
		this.officeaddress = officeaddress;
	}

	@Override
	public String toString()
	{
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + ", homeAddress=" + homeAddress
				+ ", officeaddress=" + officeaddress + "]";
	}

}
