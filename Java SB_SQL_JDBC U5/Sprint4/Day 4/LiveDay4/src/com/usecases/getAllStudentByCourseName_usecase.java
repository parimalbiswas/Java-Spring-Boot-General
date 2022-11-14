package com.usecases;

import java.util.List;
import java.util.Scanner;

import com.dao.CourseDao;
import com.dao.CourseDaoImpl;
import com.exception.CourseException;
import com.model.StudentCourseDTO;

public class getAllStudentByCourseName_usecase
{

	public static void main(String[] args)
	{
		Scanner sc1 = new Scanner(System.in);

		System.out.println("Enter Student Name->");
		String course = sc1.next();

		CourseDao dao2 = new CourseDaoImpl();
		try
		{
			List<StudentCourseDTO> list2 = dao2.getAllStudentByCourseName(course);
			list2.forEach(s -> System.out.println(s));
		}
		catch (CourseException e)
		{

			System.out.println(e.getMessage());
		}

	}

}
