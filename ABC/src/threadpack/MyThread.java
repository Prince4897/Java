package threadpack;

public class MyThread extends Thread {
// public class MyThread implements runnable {
	public void run() {
		int ctr=0;
		for(int i=1;i<=10;i++)
		
		System.out.println(ctr++);
		System.out.println(Thread.currentThread());
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread mt1=new MyThread();
		
		Thread t1=new Thread(mt1);
		t1.setName("thread1");
		t1.setPriority(1);
		t1.start();
		Thread t2=new Thread(mt1);
		t2.setName("thread2");
		//t2.setPriority(10);
		t2.start();
		System.out.println(t2.MAX_PRIORITY);
	System.out.println(Thread.currentThread());
	System.out.println(t2.getPriority());
	}

}
