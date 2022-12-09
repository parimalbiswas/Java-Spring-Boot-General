package com.parimal.service;

import com.parimal.exception.StudentException;
import com.parimal.model.Student;

public interface StudentServiceDao
{
	// supplied student dont have roll no
	// but the returend student will have auto genarated roll no.
	public Student registerStudent(Student student);

	public Student getStudentByRoll(Integer roll) throws StudentException;

}
