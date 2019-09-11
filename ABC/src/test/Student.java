package test;

public class Student {
	int stid=1;
	String name="abc";
	
	public Student()
	{
		
		System.out.println("first constructor");
		
	}
	
	public Student(int st,String n)
	{
		this.stid=st;
this.name=n;
		System.out.println(st);
	}
	
	
public static void main(String[] args)
{
Student s1=new Student();
Student s2=new Student(11,"Nisha");
System.out.println(s1.stid);
System.out.println(s1.name);
System.out.println(s2.stid);
System.out.println(s2.name);
}
}
