package threadpack;

public class testsync {

	public static void main(String[] args)
	{

		A ca1=new A();
		Thread t1=new Thread(); {
			
			Thread t1=new Thread(ca1);
			B ca2=new B();
			
			Thread t2=new Thread(ca2);
			t1.start();
			t2.start();
			}
		
	}

}