package Exception;

public class thrws 
{
		public static void main(String[] args) throws ArithmeticException
		{
			int i=0;
			int j=20;
			if(i==0)
				throw new ArithmeticException("Invalid value: 0");
			
			System.out.println((j/i));	
		}
}
