package com.usecases;

import java.util.Scanner;

import com.dao.StudentDao;
import com.dao.StudentDaoImpl;
import com.model.Student;

public class GetStudentUseCase
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Roll: -> ");
		int roll = scanner.nextInt();

		StudentDao dao1 = new StudentDaoImpl();
		Student student = dao1.getStudentByRoll(roll);

		if (student != null)
		{
			System.out.println(student);
		}
		else
		{
			System.out.println("No student exist with this %d roll");
		}

	}

}
