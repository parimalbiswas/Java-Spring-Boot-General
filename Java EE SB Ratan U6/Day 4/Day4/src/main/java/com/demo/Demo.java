package com.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Student;

public class Demo
{

	public static void main(String[] args)
	{
		EntityManagerFactory emf1 = Persistence.createEntityManagerFactory("studentUnit");
		EntityManager em1 = emf1.createEntityManager();

		Student student = new Student(0, "mmmm", 2563);

		em1.getTransaction().begin();

		em1.persist(student);

		em1.getTransaction().commit();

		em1.close();

		System.out.println("Done");
	}

}
