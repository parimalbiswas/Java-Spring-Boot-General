package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.exception.CourseException;
import com.exception.StudentException;
import com.model.Student;
import com.utility.DBUtil;

public class StudentDaoImpl implements StudentDao
{

	@Override
	public String registerStudent(Student student) throws StudentException
	{
		String result = "Not Inserted...";

		try (Connection conn1 = DBUtil.provideConnection())
		{
			PreparedStatement ps1 = conn1
					.prepareStatement("insert into student(name,address,email,password) values(?,?,?,?)");
			ps1.setString(1, student.getName());
			ps1.setString(2, student.getAddress());
			ps1.setString(3, student.getAddress());
			ps1.setString(4, student.getAddress());

			int x = ps1.executeUpdate();

			if (x > 0)
			{
				result = "registered sucessfully...";
			}

		}
		catch (SQLException e)
		{
			e.printStackTrace();
			throw new StudentException(e.getMessage());

		}

		return result;
	}

	@Override
	public Student SignedInStudent(String email, String password) throws StudentException
	{
		Student student = null;

		try (Connection conn1 = DBUtil.provideConnection())
		{
			PreparedStatement ps1 = conn1.prepareStatement("select * from student where email=? AND password=?");

			ps1.setString(1, email);
			ps1.setString(2, password);
			ResultSet rs1 = ps1.executeQuery();

			if (rs1.next())
			{
				int r1 = rs1.getInt("roll");
				String n1 = rs1.getString("name");
//				String n1 = rs1.getString("name");
				String a1 = rs1.getString("address");
				String e1 = rs1.getString("email");
				String p1 = rs1.getString("password");

				student = new Student(r1, n1, a1, e1, p1);
			}
			else
			{
				throw new StudentException("Invalid email or password");
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
	public String enrollStudentInCourse(int roll, int cid) throws StudentException, CourseException
	{
		String message = "Not enrolled...";

		try (Connection conn1 = DBUtil.provideConnection())
		{
			PreparedStatement ps1 = conn1.prepareStatement("select * from student where roll = ?");
			ps1.setInt(1, roll);
			ResultSet rs1 = ps1.executeQuery();

			if (rs1.next())
			{
				PreparedStatement ps2 = conn1.prepareStatement("select * from course where cid = ?");
				ps2.setInt(1, cid);
				ResultSet rs2 = ps2.executeQuery();

				if (rs2.next())
				{
					PreparedStatement ps3 = conn1.prepareStatement("insert into student_course values(?,?)");
					ps3.setInt(1, cid);
					ps3.setInt(2, roll);

					int x = ps3.executeUpdate();

					if (x > 0)
					{
						message = "Sutdent enrolled in course Sussfully...";
					}
				}
				else
				{
					throw new CourseException("Invalid course id" + cid);
				}
			}
			else
			{
				throw new StudentException("Student Not Exists with roll" + roll);
			}

		}
		catch (SQLException e)
		{
			e.printStackTrace();
			throw new CourseException(e.getMessage());
		}

		return message;
	}

}
