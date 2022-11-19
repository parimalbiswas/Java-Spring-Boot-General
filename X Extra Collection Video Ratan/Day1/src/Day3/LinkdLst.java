package Day3;

import java.util.LinkedList;

public class LinkdLst
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		linkedList.add(10);
		linkedList.add(50);
		linkedList.add(null);
		linkedList.add(55);
		
		for (Integer integer : linkedList)
		{
			System.out.println(integer);
		}
		

	}

}
