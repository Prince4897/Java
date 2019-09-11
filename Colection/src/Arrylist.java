import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Arrylist 
{
	public static void main(String[] args) 
	{
		Scanner a=new Scanner(System.in);
		int size=a.nextInt();
		ArrayList<Integer> l=new ArrayList<Integer>();
		for(int i=0;i<size;i++)
		{
			l.add(a.nextInt());
		}
		
		Iterator i=l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		for(Integer j:l)
		{
			System.out.print(j+" ");
		}
		
	}
}
