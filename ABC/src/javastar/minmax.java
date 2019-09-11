package javastar;

import java.util.Scanner;

public class minmax {

	public static void main(String ar[]) {
		Scanner s=new Scanner(System.in);
		int[] arrId=new int[5];
		for(int i=0;i<5;i++) {
			arrId[i]=s.nextInt();
		}
		int max,min,k,m;
		min=arrId[0];
		max=arrId[0];
		for(int i=0;i<5;i++) {
			if(min>arrId[i]) {
				min=arrId[i];
			}
			
			if(max<arrId[i]) {
				max=arrId[i];
			}}
		
	System.out.println("min is"+min);
	System.out.println("max is"+max);
	System.out.println();
	System.out.println();
	
	
	
	}
	
	
	
	
	
	
	
	
}
