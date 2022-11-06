package com.dao;

import java.util.List;

import com.exception.StudentException;
import com.model.Student;

public interface StudentDao
{

	public String insertStudentDetails(int roll, String name, int marks);

	public String insertStudentDetails2(Student student);

	public int getMarksByRoll(int roll) throws StudentException;

	public Student getStudentByRoll(int roll) throws StudentException;

	public List<Student> getAllStudent() throws StudentException;

}
