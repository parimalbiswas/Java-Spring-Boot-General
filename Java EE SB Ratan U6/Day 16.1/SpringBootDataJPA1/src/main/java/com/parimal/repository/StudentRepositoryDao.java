package com.parimal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parimal.model.Student;

@Repository
public interface StudentRepositoryDao extends JpaRepository<Student, Integer>
{
	public List<Student> findByMarks(Integer marks);

}
