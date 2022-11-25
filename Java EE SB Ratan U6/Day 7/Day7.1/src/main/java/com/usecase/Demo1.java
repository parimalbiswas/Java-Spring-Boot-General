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

		Employee employee1 = new Employee();
		employee1.setName("Ram");
		employee1.setSalary(7800);

		Department dept1 = new Department();
		dept1.setDname("IT");
		dept1.setLocation("Chennai");

		dept1.setEmp(employee1);
		employee1.setDept(dept1);

		em1.getTransaction().begin();

		em1.persist(dept1);

		em1.getTransaction().commit();

		em1.close();

		System.out.println("Done...");

	}

}
