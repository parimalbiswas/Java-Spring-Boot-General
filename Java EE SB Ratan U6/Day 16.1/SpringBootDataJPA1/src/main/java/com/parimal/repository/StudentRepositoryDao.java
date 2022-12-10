package com.parimal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.parimal.model.Student;

@Repository
public interface StudentRepositoryDao extends JpaRepository<Student, Integer>
{
	public List<Student> findByMarks(Integer marks);

	public Student findByAddress(String address); //// use for unique non primaty key filed like mobile/email

	@Query("select s.name from Student s where s.roll = :r")
	public String getStudentNameByRoll(@Param("r") Integer roll);

	@Query("select s.name,s.marks from Student s where s.address = ?1")
	public List<String> getNameAndMarksByAddress(String address);

}
