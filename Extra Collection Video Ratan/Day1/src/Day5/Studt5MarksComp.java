package Day5;

import java.util.Comparator;

public class Studt5MarksComp implements Comparator<Student5>
{

	@Override
	public int compare(Student5 o1, Student5 o2)
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
		else {
			return 0;
		}
	}

}
