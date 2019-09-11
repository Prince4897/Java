package threadpack;

import java.io.IOException;

public class TestSynchronizationMethod extends Thread {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
TestSynchronizationMethod t1=new TestSynchronizationMethod();
Runnable r1=new Runnable() {
//	@Override
	public void run()
	{
		WriteToFile wrf=new WriteToFile();
		wrf.fileWriteMethod();
	}};
Runnable r2=new Runnable() {
	
//	@Override
	public void run() {
			ReadFromFile rff=new ReadFromFile();
			try {
				rff.ReadFromFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
};
r1.run();
r2.run();

	
	}

}
