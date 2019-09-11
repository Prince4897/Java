package Collecgtions;

public class compare {
	
	private int day;
	private int  month;
	private int year;
	public compare(int d,int m,int y) {
		this.day=d;
		this.month=m;
		this.year=y;
			}


public boolean equals(Object o)
{
	boolean result=false;
	if((o!=null) && (o instanceof compare))
	{
		compare d=(compare)o; 
		if((day==d.day) && (month== d.month) && (year==d.year))
		{result=true;
		
	
	}	
	}
	return result;
}
public int hashCode() {
	System.out.println("Hashcode");
	return(day^month^year);
}
}
