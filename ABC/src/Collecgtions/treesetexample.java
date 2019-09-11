package Collecgtions;

import java.util.Comparator;
import java.util.TreeSet;


public class treesetexample implements Comparator{


	@Override
	public  int compare(Object o1, Object o2 ) {
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
	if(i1>i2)
		return -1;
	else if(i1<i2)
		return +1;
	else
		return 0;
	
	}
	
	public static void main(String [] args)
	{
		
		TreeSet<Integer> t1 = new TreeSet<Integer>(new treesetexample());

		t1.add(0);
		t1.add(13);
		t1.add(4);
		t1.add(12);
		
		//treeset l1=new treeset();
		System.out.println(t1);
				//l1.compare(9, 7);
	}
}