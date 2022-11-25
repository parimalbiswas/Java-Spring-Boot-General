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

		Employee emp1 = new Employee();
		emp1.setName("Amit");
		emp1.setSalary(10000);

		Employee emp2 = new Employee();
		emp2.setName("Suresh");
		emp2.setSalary(12000);

		Department department = new Department();
		department.setDname("Sales");
		department.setLocation("Mumbai");

		department.getEmps().add(emp1);
		department.getEmps().add(emp2);

		em1.getTransaction().begin();

		// em1.persist(emp1);
		// em1.persist(emp2);
		em1.persist(department);

		em1.getTransaction().commit();

		em1.close();

		System.out.println("Done...");

	}

}
