package test;
import java.util.*; 

public class rectangle {
	
	double d;
	double e;

	public double calArea()
	{
		double area;
		area=d*e;
		return area;
		
		
	}
	
	
	public static void main(String[] args){
		
		rectangle r1=new rectangle();
		System.out.println("Enter length and breadth");
		Scanner sc=new Scanner(System.in);
		double l=sc.nextDouble();
		double b=sc.nextDouble();
	     r1.d=l;
	     r1.e=b;
		System.out.println(r1.calArea());
		
		
	}
	
	
}
