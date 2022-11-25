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

		Department dept = em1.find(Department.class, 1);

		Employee employee = new Employee();
		employee.setName("Mukesh");
		employee.setSalary(7500);

		em1.getTransaction().begin();

		dept.getEmps().add(employee);

		em1.getTransaction().commit();

		em1.close();
		System.out.println("Done....");

	}
}
