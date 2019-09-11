package threadpack;

import java.util.List;
import java.util.stream.Collectors;

import javax.swing.plaf.synth.SynthScrollBarUI;

import java.util.ArrayList;
import java.util.Arrays;

public class Empnamemain {

	
	public static List<Empname> createEmployee(){
		return Arrays.asList(
				new Empname("Priyanka",Gender.FEMALE,30),
				new Empname("Manika",Gender.FEMALE,50),
				new Empname("Anshika",Gender.MALE,13),
				new Empname("anka",Gender.MALE,30),
				new Empname("tiliyanka",Gender.FEMALE,70),
				new Empname("poliyanka",Gender.MALE,10),
				new Empname("niyiyanka",Gender.FEMALE,7),
				new Empname("fulliyanka",Gender.MALE,3
						));
	}
	

	public static void main(String[] args) {
		List<Empname> employee=createEmployee();
		System.out.println(employee);
		
		List <String> empname1=new ArrayList<>();
		
		for(Empname emp:employee)
		{
			if(emp.getAge()<20)
			{
				empname1.add(emp.getName().toUpperCase());
			}
			
		}
		
		System.out.println(empname1);
	
	List<String> empnames2=
			employee.stream()
			.filter(emp->emp.getAge()<20)
			.map(emp->emp.getName())
			.map(name->name.toUpperCase())
			.collect(Collectors.toList());
	System.out.println("STREAM");
	System.out.println(empnames2);
	
	
	System.out.println("gender and age");
	
	/*
	 employee.stream()
	  .filter(emp->emp.getGender()==Gender.MALE)
	.map(emp->new Empname(emp.getName().toUpperCase(),
			emp.getGender(),emp.getAge()))
	.forEach(System.out::println);
	
*/	

	List empnames3=
			employee.stream()
			
			.filter(emp->emp.getGender()==Gender.MALE)
	.map(emp->new Empname(emp.getName().toUpperCase(),
			emp.getGender(),emp.getAge()))
	.collect(Collectors.toList());
	
	System.out.println(empnames3);
	

	
	}
	
}


