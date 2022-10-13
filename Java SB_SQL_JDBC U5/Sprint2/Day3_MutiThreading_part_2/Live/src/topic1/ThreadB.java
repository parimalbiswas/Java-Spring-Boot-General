package topic1;

public class ThreadB extends Thread{
	
	Common1 c;
	String name;
	public ThreadB(Common1 c, String name) {
		super();
		this.c = c;
		this.name = name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		c.fun1(name);
	}

}
