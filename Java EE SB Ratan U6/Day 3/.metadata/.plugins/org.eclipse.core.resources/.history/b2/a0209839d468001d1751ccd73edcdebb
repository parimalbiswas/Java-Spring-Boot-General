package com.parimal.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo2
{

	public static void main(String[] args)
	{
		EntityManagerFactory emf2 = Persistence.createEntityManagerFactory("studentUnit");

		EntityManager em2 = emf2.createEntityManager();

		Student student = new Student(30, "Jitu", 560);

//		EntityTransaction et2 = em2.getTransaction();
//
//		et2.begin();
//
//		em2.persist(student);
//
//		et2.commit();
//
//		em2.close();

		em2.getTransaction().begin();

		em2.persist(student);

		em2.getTransaction().commit();

		System.out.println("Student Saved.....");

	}

}
