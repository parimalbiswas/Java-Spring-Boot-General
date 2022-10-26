package date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Demo
{

	public static void main(String[] args)
	{
		//FROM DATE TO STRING
		
		LocalDate ld1 = LocalDate.now();
		System.out.println(ld1);
		
		LocalTime lt1 = LocalTime.now();
		System.out.println(lt1);
		
		LocalDateTime ltd1 = LocalDateTime.now();
		System.out.println(ld1);
		
		ZonedDateTime ztd1 = ZonedDateTime.now();
		System.out.println(ztd1);
		
		System.out.println("----------------");
		
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/mm/yyyy hh:mm:ss");
		String cuString = ltd1.format(dtf1);
		System.out.println(cuString);
		
		
		System.out.println("-----Single Line-------");
		
		String newStr1 = ltd1.format(DateTimeFormatter.ofPattern("MM//DD//YYYY HH:MM:SS"));
		System.out.println(newStr1);
		
		
		
		
		
		

	}

}
