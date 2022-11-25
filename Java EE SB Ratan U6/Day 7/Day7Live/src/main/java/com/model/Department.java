package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Department
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int deptId;
	private String dname;
	private String location;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "eid")
	private Employee emp;

	public int getDeptId()
	{
		return deptId;
	}

	public void setDeptId(int deptId)
	{
		this.deptId = deptId;
	}

	public String getDname()
	{
		return dname;
	}

	public void setDname(String dname)
	{
		this.dname = dname;
	}

	public String getLocation()
	{
		return location;
	}

	public void setLocation(String location)
	{
		this.location = location;
	}

	public Employee getEmp()
	{
		return emp;
	}

	public void setEmp(Employee emp)
	{
		this.emp = emp;
	}

	@Override
	public String toString()
	{
		return "Department [deptId=" + deptId + ", dname=" + dname + ", location=" + location + ", emp=" + emp + "]";
	}

}
