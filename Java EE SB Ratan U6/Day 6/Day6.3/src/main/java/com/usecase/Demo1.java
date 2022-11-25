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

		Department dept1 = new Department();
		dept1.setDname("Sales");
		dept1.setLocation("Kolkata");

		Department dept2 = new Department();
		dept2.setDname("Marketting");
		dept2.setLocation("Delhi");

		Employee employee1 = new Employee();
		employee1.setName("Ram");
		employee1.setSalary(7800);

		Employee employee2 = new Employee();
		employee2.setName("Madhu");
		employee2.setSalary(8850);

		employee1.getDeptList().add(dept1);
		employee2.getDeptList().add(dept1);

		dept1.getEmpList().add(employee1);
		dept1.getEmpList().add(employee2);

		employee2.getDeptList().add(dept2);
		dept2.getEmpList().add(employee2);

		em1.getTransaction().begin();

		em1.persist(dept1);
		em1.persist(dept2);

		em1.getTransaction().commit();

		em1.close();

		System.out.println("Done...");

	}

}
