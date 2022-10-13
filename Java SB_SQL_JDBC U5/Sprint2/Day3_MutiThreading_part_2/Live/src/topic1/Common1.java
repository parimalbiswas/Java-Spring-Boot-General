package topic1;

public class Common1 {
	
    public synchronized	void fun1(String name)
	{
		System.out.println("Welcome");
		
		try 
		{
			Thread.sleep(3000);
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println(name);
	}

}
