package com.dao;

import com.model.Student;

public interface StudentDao
{

	public String insertStudentDetails(int roll, String name, int marks);

	public String insertStudentDetails2(Student student);

}
