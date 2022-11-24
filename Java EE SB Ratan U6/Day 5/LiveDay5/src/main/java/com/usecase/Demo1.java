package com.usecase;

import javax.persistence.EntityManager;

import com.model.Address;
import com.model.Employee;
import com.util.EMUtil;

public class Demo1
{
	public static void main(String[] args)
	{
		EntityManager em1 = EMUtil.proviEntityManager();

		Employee employee = new Employee();
		employee.setName("Buro");
		employee.setSalary(8000);
		employee.setAddress(new Address("WB", "HOW", "711107"));

		em1.getTransaction().begin();

		em1.persist(employee);

		em1.getTransaction().commit();

		em1.close();

		System.out.println("Done");

	}
}
