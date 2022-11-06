package com.dao;

import com.exception.CourseException;
import com.exception.StudentException;
import com.model.Student;

public interface StudentDao
{
	public String registerStudent(Student student) throws StudentException;

	public Student SignedInStudent(String email, String password) throws StudentException;

	public String enrollStudentInCourse(int roll, int cid) throws StudentException, CourseException;

}
