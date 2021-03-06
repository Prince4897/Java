package threadpack;

public class SyncEX extends Thread {

static String[]message= {"This","message","will","be","read","@","thread"};
	
	public SyncEX(String id) {
		super(id);
	}
	
	public static void main(String[] args) {
		SyncEX th1=new SyncEX("Thread 1");
		SyncEX th2=new SyncEX("Thread 2");
	
	th1.start();
	th2.start();
	
	boolean th1IsAlive=true;
	boolean th2IsAlive=true;
	
	do {
		if(th1IsAlive && ! th1.isAlive()) {
			th1IsAlive=false;
			System.out.println("th1 is dead"); 
		}
	
		if(th2IsAlive && ! th2.isAlive()) {
		th2IsAlive=false;
		System.out.println("th2 is dead");
	}
	
	}while(th1IsAlive || th2IsAlive);
	
	}
void WAIT() {
	
	try {
		Thread.currentThread().sleep((long)(100*Math.random()));
	}
	
	catch(InterruptedException e)
	{
		System.out.println("Thread is Interrupted");
	}
	
}

public void run() {
	synchronized (System.out) {
		for(int i=0;i<message.length;i++)
		{
			WAIT();
			System.out.println(getName()+message[i]);
			
		}
	}
}
}