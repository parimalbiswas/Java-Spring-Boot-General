package Day3;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class DuplicateFromArryList
{

	public static ArrayList<String> remove(ArrayList<String> citis)
	{
		
		LinkedHashSet<String> set = new LinkedHashSet<>(citis);
		
		ArrayList<String> alist1 = new ArrayList<>(set);
		
		return alist1;
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("delhi");
		list.add("Kolkata");
		list.add("Chennai");
		list.add("delhi");
		list.add("Mumbai");
		list.add("Kolkata");
		
		ArrayList<String> newList= remove(list);
		
		System.out.println(newList);
		

	}

}
