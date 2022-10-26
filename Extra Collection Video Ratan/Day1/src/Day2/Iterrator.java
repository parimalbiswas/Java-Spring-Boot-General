package Day2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterrator
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(50);
		list.add(60);
		
		Iterator<Integer> itr1 = list.iterator();
		
		while (itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
	}

}
