package serialization;

import java.io.Serializable;

public class Student implements Serializable
{

//	if u want  particular value not save u can make transient them
	private int roll;
	private String name;
	private transient int marks; // default value int 0 store

	public Student()
	{

	}

	@Override
	public String toString()
	{
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}

	public Student(int roll, String name, int marks)
	{
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	public int getRoll()
	{
		return roll;
	}

	public void setRoll(int roll)
	{
		this.roll = roll;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getMarks()
	{
		return marks;
	}

	public void setMarks(int marks)
	{
		this.marks = marks;
	}

}
