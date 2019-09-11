package OverloadingDemo;

public class CalArea {
	public void Area(int l,int b) {
		
		System.out.println("the area of rectangle is"+l*b);
		
	}
	public void Area(double h,double a) {
		
		System.out.println("the area of triangle is"+(0.5*h*a));
		
	}
	
	public void Area(double r) {
		
		System.out.println("The area of circle is"+(3.14*r*r));
		
	}

	public static void main(String[] args) {
		
		CalArea c1=new CalArea();
		double r=50;
		c1.Area(r);
		int l=5,b=10;
		c1.Area(l, b);
		double h=10;
		double a=5;
		c1.Area(h, a);
			
	}

}
