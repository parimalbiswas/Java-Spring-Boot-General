package com.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil
{
	private static EntityManagerFactory emf1;
	static
	{
		emf1 = Persistence.createEntityManagerFactory("mismatchUnit");
	}

	public static EntityManager proviEntityManager()
	{
		EntityManager em1 = emf1.createEntityManager();

		return em1;
	}
}
