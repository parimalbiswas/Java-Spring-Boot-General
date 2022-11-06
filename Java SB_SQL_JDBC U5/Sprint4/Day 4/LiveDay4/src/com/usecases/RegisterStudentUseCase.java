package com.usecases;

import java.util.Scanner;

import com.dao.StudentDao;
import com.dao.StudentDaoImpl;
import com.exception.StudentException;
import com.model.Student;

public class RegisterStudentUseCase
{

	public static void main(String[] args)
	{
		Scanner sc1 = new Scanner(System.in);

		System.out.println("Enter Student Name->");
		String name = sc1.next();

		System.out.println("Enter Student Address->");
		String address = sc1.next();

		System.out.println("Enter Student email->");
		String email = sc1.next();

		System.out.println("Enter Student Password->");
		String password = sc1.next();

		Student student = new Student();
		student.setName(name);
		student.setAddress(address);
		student.setEmail(email);
		student.setPassword(password);

		StudentDao dao1 = new StudentDaoImpl();
		try
		{
			String result = dao1.registerStudent(student);

			System.out.println(result);

		}
		catch (StudentException e)
		{
			System.out.println(e.getMessage());

		}

	}

}
