package com.usecases;

import java.util.Scanner;

import com.dao.StudentDao;
import com.dao.StudentDaoImpl;
import com.exception.StudentException;
import com.model.Student;

public class GetStudentUseCase
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Roll: -> ");
		int roll = scanner.nextInt();

		StudentDao dao1 = new StudentDaoImpl();
		Student student;
		try
		{
			student = dao1.getStudentByRoll(roll);
			System.out.println(student);
		}
		catch (StudentException e)
		{
			System.out.println(e.getMessage());
		}

//		if (student != null)
//		{
//			System.out.println(student);
//		}
//		else
//		{
//			System.out.println("No student exist with this %d roll");
//		}

	}

}
