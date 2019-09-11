package Collecgtions;

import java.util.LinkedList;
import java.util.Stack;

public class stack {

	
	public static void main(String[] args) {
		
		Stack<String>waitingStack=new Stack<>();
		waitingStack.add("Rajeev");
		waitingStack.add("Chris");
		waitingStack.add("John");
		waitingStack.add("Mark");
		waitingStack.add("Steven");
	
		System.out.println("waitingStack :"+waitingStack);
		
		String name=waitingStack.remove(0);
		System.out.println("Removed from waitingStack :"+name+"New waitingStack:"+waitingStack);
		
		name=waitingStack.pop();
		System.out.println("Removed from waitingStack:"+name+"New waitingStack:"+waitingStack);
		
	}
}

