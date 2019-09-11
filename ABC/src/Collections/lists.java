package Collections;

import java.util.*;

public class lists {
	public static void main(String args[])
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("Reema");
		list.add("Viraj");
		list.add("Reema");
		list.add("5");
		list.add("Reema");

		System.out.println(list.size());
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
	}

}
