package javastar;

import java.util.Scanner;

public class aestrica {
	public static void main(String[] args) {
	
	int space,size,k;
	Scanner sc=new Scanner(System.in);
	size=sc.nextInt();
	for(int i=1;i<size;i++)
	{
		for(space=1;space<size;space++) {
	
			System.out.println(" ");
	}	
	for(k=0;k<i;k++)
	{
		System.out.print("*");
		
	}
		System.out.println(" ");
		
	}
}
}