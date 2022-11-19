package date_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Demo2
{

	public static void main(String[] args)
	{
		//FROM STRING TO DATE
		String dob1 = "12/07/1996";
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate ld1 = LocalDate.parse(dob1,dtf1);
		
		System.out.println(ld1);
		
	}

}
