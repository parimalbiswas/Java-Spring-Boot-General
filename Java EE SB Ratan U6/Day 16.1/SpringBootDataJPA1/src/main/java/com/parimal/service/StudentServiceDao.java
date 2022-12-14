package com.parimal.service;

import java.util.List;

import com.parimal.exception.StudentException;
import com.parimal.model.Student;
import com.parimal.model.StudentDTO;

public interface StudentServiceDao
{
	// supplied student dont have roll no
	// but the returend student will have auto genarated roll no.
	public Student registerStudent(Student student);

	public Student getStudentByRoll(Integer roll) throws StudentException;

	public List<Student> getAllStudents() throws StudentException;

	public Student deleteStudentByRoll(Integer rolI) throws StudentException;

	public Student updateStudentDetails(Student student) throws StudentException;

	public Student updateStudentMarks(Integer roll, Integer graceMarks) throws StudentException;

	public List<Student> getStudentsByMarks(Integer marks) throws StudentException;

	public Student getStudentByAddress(String address) throws StudentException;

	public String getStudentNameByRoll(Integer roll) throws StudentException;

	public List<String> getNameAndMarksByAddress(String address) throws StudentException;

	public List<StudentDTO> getNameAndMarksByAddress2(String address) throws StudentException; // ByDTO

}
