package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.exception.StudentException;
import com.model.Student;
import com.utility.DBUtil;

public class StudentDaoImpl implements StudentDao
{

	@Override
	public String insertStudentDetails(int roll, String name, int marks)
	{
		String message = "Not Inserted........";

		try (Connection conn1 = DBUtil.provideConnection())
		{
			PreparedStatement ps1 = conn1.prepareStatement("insert into student values(?,?,?)");

			ps1.setInt(1, roll);
			ps1.setString(2, name);
			ps1.setInt(3, marks);

			int x = ps1.executeUpdate();

			if (x > 0)
			{
				message = "Record inserted succsfully...";
			}

		}
		catch (SQLException e)
		{
			message = e.getMessage();
		}

		return message;
	}

	@Override
	public String insertStudentDetails2(Student student)
	{
		String message = "Not Inserted........";

		try (Connection conn1 = DBUtil.provideConnection())
		{
			PreparedStatement ps1 = conn1.prepareStatement("insert into student values(?,?,?)");

			ps1.setInt(1, student.getRoll());
			ps1.setString(2, student.getName());
			ps1.setInt(3, student.getMarks());

			int x = ps1.executeUpdate();

			if (x > 0)
			{
				message = "Record inserted succsfully...";
			}

		}
		catch (SQLException e)
		{
			message = e.getMessage();
		}

		return message;
	}

	@Override
	public int getMarksByRoll(int roll) throws StudentException
	{
		int marks = -1;

		try (Connection conn1 = DBUtil.provideConnection())
		{
			PreparedStatement ps1 = conn1.prepareStatement("select marks from student where roll = ?");

			ps1.setInt(1, roll);
			ResultSet rs1 = ps1.executeQuery();

			if (rs1.next())
			{
				marks = rs1.getInt("marks");
			}
			else
			{
				throw new StudentException("Student not found with roll " + roll);
			}

		}
		catch (SQLException e)
		{
			e.printStackTrace();
			throw new StudentException(e.getMessage());
		}

		return marks;
	}

	@Override
	public Student getStudentByRoll(int roll) throws StudentException
	{
		Student student = null;

		try (Connection conn1 = DBUtil.provideConnection())
		{
			PreparedStatement ps1 = conn1.prepareStatement("select * from student where roll = ?");
			ps1.setInt(1, roll);

			ResultSet rs1 = ps1.executeQuery();

			if (rs1.next())
			{
				int r = rs1.getInt("roll");
				String n = rs1.getString("name");
				int m = rs1.getInt("marks");

				student = new Student(r, n, m);
			}
			else
			{
				throw new StudentException("Student does not exist with roll " + roll);
			}

		}
		catch (SQLException e)
		{
			e.printStackTrace();
			throw new StudentException(e.getMessage());
		}
		return student;
	}

	@Override
	public List<Student> getAllStudent() throws StudentException
	{
		List<Student> listStudents = new ArrayList<>();

		try (Connection conn1 = DBUtil.provideConnection())
		{
			PreparedStatement ps1 = conn1.prepareStatement("select * from student");
			ResultSet rs1 = ps1.executeQuery();

			while (rs1.next())
			{
				int r = rs1.getInt("roll");
				String n = rs1.getString("name");
				int m = rs1.getInt("marks");

				Student student = new Student(r, n, m);
				listStudents.add(student);
			}
		}
		catch (SQLException e)
		{
			// System.out.println(e.getMessage());
			throw new StudentException("No student Found");
		}

		return listStudents;
	}

}
