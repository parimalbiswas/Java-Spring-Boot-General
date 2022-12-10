package com.parimal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parimal.exception.StudentException;
import com.parimal.model.Student;
import com.parimal.model.StudentDTO;
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

	@Override
	public List<Student> getAllStudents() throws StudentException
	{
		List<Student> students = sRepoDao.findAll();

		if (students.size() == 0)
		{
			throw new StudentException("No Student Found");
		}
		else
		{
			return students;
		}

	}

	@Override
	public Student deleteStudentByRoll(Integer roll) throws StudentException
	{
		Optional<Student> opt = sRepoDao.findById(roll);

		if (opt.isPresent())
		{
			Student existingStudent = opt.get();
			sRepoDao.delete(existingStudent);

			return existingStudent;
		}
		else
		{
			throw new StudentException("Student Does not exists with roll" + roll);
		}

	}

	@Override
	public Student updateStudentDetails(Student student) throws StudentException
	{
		Optional<Student> opt = sRepoDao.findById(student.getRoll());

		if (opt.isPresent())
		{
			Student updatedStudent = sRepoDao.save(student);
			return updatedStudent;
		}
		else
		{
			throw new StudentException("Invalid Student Details...");
		}

	}

	@Override
	public Student updateStudentMarks(Integer roll, Integer graceMarks) throws StudentException
	{
		Student existStudent = sRepoDao.findById(roll)
				.orElseThrow(() -> new StudentException("Student Does Not Exists with roll " + roll));

		existStudent.setMarks(existStudent.getMarks() + graceMarks);

		return sRepoDao.save(existStudent);
	}

	@Override
	public List<Student> getStudentsByMarks(Integer marks) throws StudentException
	{
		List<Student> students = sRepoDao.findByMarks(marks);

		if (students.size() == 0)
		{
			throw new StudentException("No Student Found...");
		}
		else
		{
			return students;
		}
	}

	@Override
	public Student getStudentByAddress(String address) throws StudentException
	{
		Student student = sRepoDao.findByAddress(address);

		if (student == null)
		{
			throw new StudentException("Student Not Found with address : " + address);
		}
		else
		{

			return student;
		}

	}

	@Override
	public String getStudentNameByRoll(Integer roll) throws StudentException
	{
		String name = sRepoDao.getStudentNameByRoll(roll);

		if (name == null)
		{
			throw new StudentException("Student Not Found with Roll : " + roll);
		}
		else
		{
			return name;
		}

	}

	@Override
	public List<String> getNameAndMarksByAddress(String address) throws StudentException
	{
		List<String> result = sRepoDao.getNameAndMarksByAddress(address);

		if (result.size() == 0)
		{
			throw new StudentException("No Student Found By this Address " + address);
		}
		else
		{
			return result;
		}
	}

	@Override
	public List<StudentDTO> getNameAndMarksByAddress2(String address) throws StudentException
	{
		List<StudentDTO> result = sRepoDao.getNameAndMarksByAddress2(address);

		if (result.size() == 0)
		{
			throw new StudentException("No Student Found By this Address " + address);
		}
		else
		{
			return result;
		}
	}

}
