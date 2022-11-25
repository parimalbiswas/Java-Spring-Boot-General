package com.usecase;

import javax.persistence.EntityManager;

import com.model.ContractualEmployee;
import com.model.Employee;
import com.model.SalaryEmployee;
import com.util.EMUtil;

public class Demo1
{
	public static void main(String[] args)
	{
		EntityManager em1 = EMUtil.proviEntityManager();

		Employee employee = new Employee();
		employee.setName("Shyam");

		SalaryEmployee salEmp = new SalaryEmployee();
		salEmp.setName("Mohan");
		salEmp.setSalary(8500);

		ContractualEmployee conEmp = new ContractualEmployee();
		conEmp.setName("Cumki");
		conEmp.setCostPerDay(5000);
		conEmp.setNoOfWorkingDays(10);

		em1.getTransaction().begin();

		em1.persist(employee);
		em1.persist(salEmp);
		em1.persist(conEmp);

		em1.getTransaction().commit();

		em1.close();

		System.out.println("Done...");

	}

}
