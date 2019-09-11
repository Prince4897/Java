package Collecgtions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchName {
	
	public static void main(String args[])
	
	{
		
		List<String>name=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{	name.add(sc.next());
			//name.add(new name(sc.next());
		}
		System.out.println("Enter the find");
		String s=sc.next();
		System.out.println(name.indexOf(s));
		
		
	}
	

}
