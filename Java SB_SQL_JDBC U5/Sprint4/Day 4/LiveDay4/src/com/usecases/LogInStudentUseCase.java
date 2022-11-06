package com.usecases;

import java.util.Scanner;

import com.dao.StudentDao;
import com.dao.StudentDaoImpl;
import com.exception.StudentException;
import com.model.Student;

public class LogInStudentUseCase
{
	public static void main(String[] args)
	{
		Scanner sc1 = new Scanner(System.in);

		System.out.println("Enter Student email->");
		String email = sc1.next();

		System.out.println("Enter Student Password->");
		String password = sc1.next();

		StudentDao dao1 = new StudentDaoImpl();
		try
		{
			Student student = dao1.SignedInStudent(email, password);
			System.out.println(student);
		}
		catch (StudentException e)
		{
			System.out.println(e.getMessage());
		}

	}
}
