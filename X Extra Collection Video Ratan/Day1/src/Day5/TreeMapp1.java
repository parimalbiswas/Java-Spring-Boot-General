package Day5;

import java.util.TreeMap;

public class TreeMapp1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		TreeMap<Integer, String> tm1 = new TreeMap<>();
		tm1.put(10, "Delhi");
		tm1.put(1, "kol");
		tm1.put(12, "Chnnei");
		tm1.put(7, "Odia");
		tm1.put(3, "Assam");
		
		System.out.println(tm1);
		
		System.out.println("---------------------------");
		
		Studt5MarksComp smc1 = new Studt5MarksComp();
		TreeMap<Student5, String> tm2 = new TreeMap<>(smc1);
		tm2.put(new Student5(5, "s1", 500), "Delhi");
		tm2.put(new Student5(12, "f2", 120), "kol");
		tm2.put(new Student5(3,"gt",890), "Chnnei");
		tm2.put(new Student5(8,"ryt",230), "Odia");
		tm2.put(new Student5(10,"popo",20), "Assam");
		
		System.out.println(tm2);
	}

}
