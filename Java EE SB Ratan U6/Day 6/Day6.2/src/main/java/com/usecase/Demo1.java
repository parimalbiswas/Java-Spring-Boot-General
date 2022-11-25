package com.usecase;

import javax.persistence.EntityManager;

import com.model.Department;
import com.model.Employee;
import com.util.EMUtil;

public class Demo1
{
	public static void main(String[] args)
	{
		EntityManager em1 = EMUtil.proviEntityManager();

		Department dept = new Department();
		dept.setDname("Marketting");
		dept.setLocation("Goa");

		Employee employee1 = new Employee();
		employee1.setName("Ram");
		employee1.setSalary(7800);
		employee1.setDept(dept);

		Employee employee2 = new Employee();
		employee2.setName("Madhu");
		employee2.setSalary(8850);
		employee2.setDept(dept);

		em1.getTransaction().begin();

		em1.persist(employee1);
		em1.persist(employee2);

		em1.getTransaction().commit();

		em1.close();

		System.out.println("Done...");

	}

}
