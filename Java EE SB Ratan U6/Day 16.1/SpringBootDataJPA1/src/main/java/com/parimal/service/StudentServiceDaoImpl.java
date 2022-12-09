package com.parimal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parimal.exception.StudentException;
import com.parimal.model.Student;
import com.parimal.repository.StudentRepositoryDao;

@Service
public class StudentServiceDaoImpl implements StudentServiceDao
{
	@Autowired
	private StudentRepositoryDao sRepoDao;

	@Override
	public Student registerStudent(Student student)
	{

		Student savedStudent = sRepoDao.save(student);

		return savedStudent;
	}

	@Override
	public Student getStudentByRoll(Integer roll) throws StudentException
	{
//		Optional<Student> opt = sRepoDao.findById(roll);
//
//		if (opt.isPresent())
//		{
//			Student student = opt.get();
//			return student;
//		}
//		else
//		{
//			throw new StudentException("Student Not Exists with roll..." + roll);
//		}

		return sRepoDao.findById(roll)
				.orElseThrow(() -> new StudentException("Student Not Exists with roll..." + roll));
	}

}
