package MTHD_PART3;

public class Demo1 extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		System.out.println("Inside run");
		
		
		System.out.println("end run");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo1 demo1 = new Demo1();
		demo1.start();
		
		
		
		
//		System.out.println("end run");	

	}

}
