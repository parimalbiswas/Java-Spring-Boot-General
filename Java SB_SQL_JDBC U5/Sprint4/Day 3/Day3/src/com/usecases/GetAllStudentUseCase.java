package com.usecases;

import java.util.List;

import com.dao.StudentDao;
import com.dao.StudentDaoImpl;
import com.exception.StudentException;
import com.model.Student;

public class GetAllStudentUseCase
{

	public static void main(String[] args)
	{
		StudentDao dao1 = new StudentDaoImpl();

		try
		{
			List<Student> listStudents = dao1.getAllStudent();
			listStudents.forEach(s -> System.out.println(s));
		}
		catch (StudentException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
