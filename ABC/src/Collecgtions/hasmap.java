package Collecgtions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hasmap {

	public static void main(String[] args) {
		Map<String,Integer>numberMapping=new HashMap<>();
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			numberMapping.put(sc.next(),sc.nextInt()); 
		}
		
		/*numberMapping.put("One",1);
		numberMapping.put("Two",2);
		numberMapping.put("Three",3);
		//numberMapping.put("",5);
		//numberMapping.put("",6);
		//numberMapping.put("",7);
		//numberMapping.put("Three",9);
		numberMapping.put("",98);
		numberMapping.putIfAbsent("Four",4);
		*/
		System.out.println(numberMapping.values());
		System.out.println(numberMapping.keySet());
		System.out.println(numberMapping.entrySet());
	}
	
}
