package Collecgtions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Hashset {

	public static void main(String[] args) {
		
		
		List<Integer>numberDivisibleby5=new ArrayList<>();
		numberDivisibleby5.add(5);
		numberDivisibleby5.add(10);
		numberDivisibleby5.add(15);
		numberDivisibleby5.add(20);
		numberDivisibleby5.add(25);
	
	List<Integer>numberDivisibleby3=new ArrayList<>();
	numberDivisibleby3.add(3);
	numberDivisibleby3.add(6);
	numberDivisibleby3.add(9);
	numberDivisibleby3.add(12);
	numberDivisibleby3.add(15);
	
	Set<Integer>numbersDivisibleBy5or3=new TreeSet<>(numberDivisibleby5);
	numbersDivisibleBy5or3.addAll(numberDivisibleby3);
	System.out.println(numbersDivisibleBy5or3);

	}	
}
