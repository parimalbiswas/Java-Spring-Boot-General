package date_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class WE
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter DOB");
		String dobString = scanner.nextLine();
		
		try
		{
			DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			
			LocalDate localDate = LocalDate.parse(dobString,dtf1);
			
			System.out.println(localDate);
			
			System.out.println("-----------------------");
			
			String dayFind1 = localDate.format(DateTimeFormatter.ofPattern("EEEE"));
			
			System.out.println("Your BirthDay is-->"+dayFind1);
			
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		

	}

}
