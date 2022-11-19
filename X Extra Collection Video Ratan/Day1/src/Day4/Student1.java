package Day4;

public class Student1 implements Comparable<Student1>
{

	int roll;
	String name;
	int marks;
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
	@Override
	public String toString()
	{
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	public Student1(int roll, String name, int marks)
	{
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	public Student1()
	{
		super();
	}
	@Override
	public int compareTo(Student1 that)
	{
		//Sort According to marks
//	    if (this.getMarks() > that.getMarks())
//		{
//			return -1;
//		}  
//	    else if (this.getMarks() < that.getMarks()) 
//	    {
//			return +1;
//		}
//	    else {
//			return 0;
//		}
	    
	    
	  //Sort According to name Accsending order
	    //return this.getName().compareTo(that.getName());
	  //Sort According to name Decending order
	    //return that.getName().compareTo(this.getName());
		
		
		
		
	    if (this.getMarks() > that.getMarks())
		{
			return -1;
		}  
	    else if (this.getMarks() < that.getMarks()) 
	    {
			return +1;
		}
	    else {
			return this.getName().compareTo(that.getName());
		}
		
		
		
	}
	
	
	
	
	
}
