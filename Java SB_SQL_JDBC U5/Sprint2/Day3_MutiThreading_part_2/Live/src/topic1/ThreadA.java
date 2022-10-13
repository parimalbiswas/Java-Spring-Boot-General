package topic1;

public class ThreadA extends Thread{
	Common1 c;
	String name;
	public ThreadA(Common1 c, String name) {
		super();
		this.c = c;
		this.name = name;
	}
	
	
	@Override
	public void run() {
		c.fun1(name);
	}
	
	

	
}
