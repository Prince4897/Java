package test;
import java.util.Scanner;

public class Array2 {
	
	
	public static void main(String[] args) {

	
/*	System.out.println("please enter the number of rows and coloumns");
	Scanner sc=new Scanner(System.in);
	int r=sc.nextInt();
	int c=sc.nextInt();
	String city[][]=new String[r][c];
	for(int i=0;i<r;i++) {
		for(int j=0;j<c;j++) {
			city[i][j]=sc.next();
		}
	}
	for(int i=0;i<r;i++) {
		for(int j=0;j<c;j++) 
		{
		System.out.print(city[i][j]+"\t");
	}

	System.out.println();
	}*/
	
	/*	System.out.println("please enter the number of rows and coloumns");
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		Double salary[][]=new Double[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				salary[i][j]=sc.nextDouble();
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) 
			{
			System.out.print(salary[i][j]+"\t");
		}

		System.out.println();
	
	
	}*/

		
			   
			int a[][]={{1,2},{3,4}};    
			int b[][]={{5,6},{7,8}};    
			    
			
			int c[][]=new int[2][2]; 
			    
			  
			for(int i=0;i<2;i++){    
			for(int j=0;j<2;j++){    
			c[i][j]=0;      
			for(int k=0;k<2;k++)      
			{      
			c[i][j]+=a[i][k]*b[k][j];      
			}
			System.out.print(c[i][j]+" ");  
			} 
			System.out.println();
			}    
			}}  


/*int a[][]={{1,2},{3,4}};    
int b[][]={{5,6},{7,8}};    
    

int c[][]=new int[2][2]; 
    
  
for(int i=0;i<2;i++){    
for(int j=0;j<2;j++){    
c[i][j]=0;      
//for(int k=0;k<2;k++)      
//{      
c[i][j]+=a[i][j]*b[j][i];      
//}
System.out.print(c[i][j]+" ");  
} 
System.out.println();
}    
}}  */



