package Collecgtions;

import java.util.LinkedList;
import java.util.Queue;

public class queue {

	
	public static void main(String[] args) {
		
		Queue<String>waitingQueue=new LinkedList<>();
		waitingQueue.add("Rajeev");
		waitingQueue.add("Chris");
		waitingQueue.add("John");
		waitingQueue.add("Mark");
		waitingQueue.add("Steven");
	
		System.out.println("Waiting Queue:"+waitingQueue);
		
		String name=waitingQueue.remove();
		System.out.println("Removed from Waiting Queue:"+name+"New WaitingQueue:"+waitingQueue);
		
		name=waitingQueue.poll();
		System.out.println("Removed from WaitingQueue:"+name+"New WaitingQueue:"+waitingQueue);
		
	}
}
