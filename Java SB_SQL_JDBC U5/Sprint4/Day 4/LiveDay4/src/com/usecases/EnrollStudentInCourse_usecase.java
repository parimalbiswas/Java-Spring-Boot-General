package com.usecases;

import java.util.Scanner;

import com.dao.StudentDao;
import com.dao.StudentDaoImpl;
import com.exception.CourseException;
import com.exception.StudentException;

public class EnrollStudentInCourse_usecase
{
	public static void main(String[] args)
	{
		Scanner sc1 = new Scanner(System.in);

		System.out.println("Enter roll->");
		int roll = sc1.nextInt();

		System.out.println("Enter cid->");
		int cid = sc1.nextInt();

		StudentDao dao1 = new StudentDaoImpl();
		try
		{
			String message = dao1.enrollStudentInCourse(roll, cid);
			System.out.println(message);
		}
		catch (StudentException e1)
		{
			System.out.println(e1.getMessage());
		}
		catch (CourseException e2)
		{
			System.out.println(e2.getMessage());
		}

	}
}
