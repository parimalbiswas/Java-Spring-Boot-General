package com.usecase;

import java.util.List;

import javax.persistence.EntityManager;

import com.model.Department;
import com.model.Employee;
import com.util.EMUtil;

public class Demo2
{

	public static void main(String[] args)
	{
		EntityManager em1 = EMUtil.proviEntityManager();

		Department dept = em1.find(Department.class, 1);

		List<Employee> emps = dept.getEmps();

		emps.forEach(e ->
		{

			System.out.println(e.getEmpId());
			System.out.println(e.getName());
			System.out.println(e.getSalary());
			System.out.println("============");
		});

		em1.close();
		System.out.println("Done....");

	}
}
