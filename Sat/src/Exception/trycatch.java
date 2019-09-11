package Exception;

import java.io.IOException;

public class trycatch 
{
	public static void main(String[] args)
	{
		int i=0;
		int j=20;
		try 
		{
		int e=j/i;
		
		}
		catch(ArithmeticException e)
		{
			//e.printStackTrace();
			System.out.println("Exception: "+e );
		}
	}
}
