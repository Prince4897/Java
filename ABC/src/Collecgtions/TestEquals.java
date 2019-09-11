package Collecgtions;

public class TestEquals {

	public static void main(String[] args) {
	
		
		compare date1=new compare(2,3,2019);
		compare date2=new compare(2,3,2019);
		if(date1==date2)
		{
			System.out.println("Date1 is identical to date2");
		}
		else
		{
			System.out.println("Date1 is unidentical to date2");
		}

if(date1.equals(date2))
{
	System.out.println("Date1 is equal to date2");
}

else
{
	System.out.println("Date1 is not equal to date2");
}

	}
}