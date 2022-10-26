package Day4;

import java.util.Comparator;

public class SortByMarks implements Comparator<Student1>
{

	@Override
	public int compare(Student1 o1, Student1 o2)
	{
		// TODO Auto-generated method stub
		if (o1.getMarks() > o2.getMarks())	
		{
			return +1;
		}
		else if (o1.getMarks() < o2.getMarks()) 
		{
			return -1;
		}
		else 
		{
			return 0;
		}
	}

}
