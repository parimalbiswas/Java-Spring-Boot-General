//IMPORTANT
package Day2;

import java.util.ArrayList;
import java.util.Scanner;

public class Col2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		ArrayList<Student> students = new ArrayList<>();
		
		Scanner scanner = new Scanner(System.in);
		
		int count = 1;
		
		while (true)
		{
			System.out.println("Enter the details of Studednt -> "+(count++));
			
			
			System.out.println("Enter Roll");
			int roll = scanner.nextInt();
			
			System.out.println("Enter Name");
			String name = scanner.next();
			
			System.out.println("Enter marks");
			int marks = scanner.nextInt();
			
			Student student = new Student(roll,name,marks);
			
			students.add(student);
			
			
			System.out.println("Want More (y/n)");
			String choice1 = scanner.next();
			
			if (choice1.equalsIgnoreCase("n"))	
			{
				break;
			}	
			
		}
		
		System.out.println("Printing students");
		System.out.println("=========================");
		
		for (Student element : students)
		{
			System.out.println("roll is -> "+element.getRoll());
			System.out.println("name is -> "+element.getName());
			System.out.println("Marks is ->"+element.getMarks());
			System.out.println("------------------------");
		}
		

	}

}
