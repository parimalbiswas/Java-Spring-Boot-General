//D DELETE
package com.parimal.entities;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo3
{

	public static void main(String[] args)
	{
		EntityManagerFactory emf1 = Persistence.createEntityManagerFactory("studentUnit");
		EntityManager em1 = emf1.createEntityManager();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Roll to Delete");
		int roll = scanner.nextInt();

		Student student = em1.find(Student.class, roll);

		if (student != null)
		{
			em1.getTransaction().begin();

			em1.remove(student);

			em1.getTransaction().commit();

			System.out.println("Student Removed...");
		}
		else
		{
			System.out.println("Student Not Found...");
		}
		em1.close();

	}

}
