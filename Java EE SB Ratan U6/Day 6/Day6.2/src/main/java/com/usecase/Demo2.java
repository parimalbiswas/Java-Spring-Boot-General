package com.usecase;

import javax.persistence.EntityManager;

import com.model.Department;
import com.model.Employee;
import com.util.EMUtil;

public class Demo2
{

	public static void main(String[] args)
	{
		EntityManager em1 = EMUtil.proviEntityManager();

		Employee emp = em1.find(Employee.class, 3);

		Department dept = emp.getDept();

		System.out.println(dept.getDeptId());
		System.out.println(dept.getDname());
		System.out.println(dept.getLocation());

		em1.close();
		System.out.println("Done....");

	}
}
