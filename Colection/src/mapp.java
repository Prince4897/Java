
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;


public class mapp 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		h.put(1,"Rohit");
		h.put(2,"Rajesh");
		
		Set hm = h.entrySet();
		Iterator it = hm.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
	}
}
