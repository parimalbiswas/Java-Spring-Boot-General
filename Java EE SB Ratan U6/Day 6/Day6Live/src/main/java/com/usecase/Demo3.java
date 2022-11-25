package com.usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.model.Employee;
import com.util.EMUtil;

public class Demo3
{

	public static void main(String[] args)
	{
//		1:11:47

		EntityManager em1 = EMUtil.proviEntityManager();

		String jpql = "select emps from Department where dname=:dn";

		Query query = em1.createQuery(jpql);

		query.setParameter("dn", "Sales");

		List<Employee> allemps = query.getResultList();

		allemps.forEach(s -> System.out.println(s));
	}
}
