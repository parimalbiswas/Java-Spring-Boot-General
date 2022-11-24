package com.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

@Entity
public class Employee2
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	private String name;
	private int salary;

	@ElementCollection(fetch = FetchType.EAGER)
	@Embedded
	@JoinTable(name = "empaddress", joinColumns = @JoinColumn(name = "emp_id"))
	private List<Address> addresseslist = new ArrayList<>();

	public Employee2()
	{
		super();
	}

	public Employee2(String name, int salary, List<Address> addresseslist)
	{
		super();
		this.name = name;
		this.salary = salary;
		this.addresseslist = addresseslist;
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

	public List<Address> getAddresseslist()
	{
		return addresseslist;
	}

	public void setAddresseslist(List<Address> addresseslist)
	{
		this.addresseslist = addresseslist;
	}

	@Override
	public String toString()
	{
		return "Employee2 [eid=" + eid + ", name=" + name + ", salary=" + salary + ", addresseslist=" + addresseslist
				+ "]";
	}

}
