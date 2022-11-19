package date_time;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Vote_Cast_Elgble
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter DOB");
		String dobString = scanner.nextLine();
		
		try
		{
			LocalDate d1 = LocalDate.parse(dobString, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			
			LocalDate localDate = LocalDate.now();
			
			Period p1 = Period.between(d1, localDate);
			
			if (p1.getYears() >= 18)		
			{
				System.out.println("Eligble for Vote");
			}
			else {
				System.out.println("Not Eligable");
			}
			
			
		}
		catch (Exception e)
		{
			System.out.println("Please enter valid DOB pattern");
		}

	}

}
