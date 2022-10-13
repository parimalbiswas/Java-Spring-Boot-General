package topic1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Common1 c = new Common1();
		
		ThreadA t1 = new ThreadA(c, "Ram");
		ThreadB t2 = new ThreadB(c, "Syam");


		
		t1.start();
		t2.start();
	
		

	}

}
