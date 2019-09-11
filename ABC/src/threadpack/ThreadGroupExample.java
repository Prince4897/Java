package threadpack;

 class Cancellation extends Thread{
	public void run()
	{
		System.out.println("I am cancellation thread");
	}

}

class Reservation extends Thread{
	public void run()
	{
		System.out.println("Reservation thread");
	}
}

public class ThreadGroupExample{
	
	public static void main(String[] args) {
		Reservation res=new Reservation();
		Cancellation can= new Cancellation();
		ThreadGroup tg1=new ThreadGroup("First group");
		Thread t1=new Thread(tg1,res,"First Thread");
		Thread t2=new Thread(tg1,res,"Second Thread");
	ThreadGroup tg2=new ThreadGroup("Secon group");
	Thread t3=new Thread(tg2,can,"Third Thread");
	Thread t4=new Thread(tg2,can,"Fourth Thread");
	
	System.out.println("parent of tg1="+tg1.getParent());
	tg1.setMaxPriority(7);
	System.out.println("Thread group of t1="+t1.getThreadGroup());
	System.out.println("Thread group of t3="+t3.getThreadGroup());
	
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	
	System.out.println("No. of thread active in tg1="+tg1.activeCount());
	
	
	}
	
}