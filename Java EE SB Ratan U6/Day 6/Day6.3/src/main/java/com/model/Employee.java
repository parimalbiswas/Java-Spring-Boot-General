package com.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	private String name;
	private int salary;

	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "empList")
	private List<Department> deptList = new ArrayList<>();

	public int getEmpId()
	{
		return empId;
	}

	public void setEmpId(int empId)
	{
		this.empId = empId;
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

	public List<Department> getDeptList()
	{
		return deptList;
	}

	public void setDeptList(List<Department> deptList)
	{
		this.deptList = deptList;
	}

	@Override
	public String toString()
	{
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", deptList=" + deptList + "]";
	}

}
