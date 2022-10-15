package IO_Class;

import java.io.File;
import java.io.IOException;

public class Check1 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		try 
		{
//			File f11 = new File("k://a1.txt");
			File f11 = new File("a1.txt");
			
			if (f11.createNewFile()) {
				System.out.println("New file created");
			}
			else {
				System.out.println("File already exists");
			}
		} 
		catch (Exception e) 
		{
			System.out.println("Invalid location to create file");
		}
	
		
		

	}

}
