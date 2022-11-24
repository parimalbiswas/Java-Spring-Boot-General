package com.usecase;

import java.util.List;

import javax.persistence.EntityManager;

import com.model.Address;
import com.model.Employee2;
import com.util.EMUtil;

public class Demo4
{
	public static void main(String[] args)
	{
		EntityManager em1 = EMUtil.proviEntityManager();

		Employee2 emp = em1.find(Employee2.class, 1);

		em1.clear();

		System.out.println(emp.getEid());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());

		List<Address> addList = emp.getAddresseslist();

		addList.forEach(s -> System.out.println(s));

	}

}
