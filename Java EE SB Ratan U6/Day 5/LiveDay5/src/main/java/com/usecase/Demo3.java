//package com.usecase;
//
//import java.util.List;
//import java.util.Set;
//
//import javax.persistence.EntityManager;
//
//import com.model.Address;
//import com.model.Employee;
//import com.mysql.cj.Query;
//import com.util.EMUtil;
//
//public class Demo3
//{
//	public static void main(String[] args)
//	{
//		EntityManager em = EMUtil.proviEntityManager();
//
//		// get all the Address of a Employee whose name is Ramesh
//
//		String jpql = "from Employee where name='Ramesh'";
//
//		Query q = (Query) em.createQuery(jpql);
//
//		List<Employee> emps = q.getA
//
//		for (Employee emp : emps)
//		{
//
//			Set<Address> addrs = emp.getAddresses();
//
//			for (Address adr : addrs)
//			{
//
//				System.out.println(adr);
//			}
//
//		}
//
//		em.close();
//	}
//}
