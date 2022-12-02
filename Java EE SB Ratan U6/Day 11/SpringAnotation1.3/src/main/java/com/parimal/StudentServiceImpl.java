package com.parimal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService
{
	@Autowired
	private StudentDao sDao;

	@Override
	public String saveStudent(Student student)
	{
		// TODO Auto-generated method stub
		return sDao.insertStudentDetails(student);
	}

	@Override
	public List<Student> getAllStudents()
	{
		// TODO Auto-generated method stub
		return sDao.getAllStudentDetails();
	}

}
