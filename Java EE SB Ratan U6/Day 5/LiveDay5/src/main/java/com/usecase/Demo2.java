package com.usecase;

import javax.persistence.EntityManager;

import com.model.Address;
import com.model.Employee2;
import com.util.EMUtil;

public class Demo2
{
	public static void main(String[] args)
	{
		EntityManager em1 = EMUtil.proviEntityManager();

		Employee2 employee = new Employee2();
		employee.setName("Buro");
		employee.setSalary(8000);
		employee.getAddresseslist().add(new Address("WB", "HWH", "711107"));
		employee.getAddresseslist().add(new Address("KA", "BLR", "33520"));

//		employee.setHomeAddress(new Address("WB", "HWH", "711107"));
//		employee.setOfficeaddress(new Address("KA", "BLR", "33520"));

		em1.getTransaction().begin();

		em1.persist(employee);

		em1.getTransaction().commit();

		em1.close();

		System.out.println("Done");

	}
}
