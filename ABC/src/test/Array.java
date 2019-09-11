package test;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		
Scanner s=new Scanner(System.in);
int[] arrId=new int[5];
String[] arrName= new String[5];
for(int i=0;i<5;i++) {
	arrId[i]=s.nextInt();
	arrName[i]=s.next();
	
}

System.out.println("ID  NAME");
for(int i=0;i<5;i++) {
	System.out.println(arrId[i]+"  "+arrName[i]);
}
s.close();
}
}
