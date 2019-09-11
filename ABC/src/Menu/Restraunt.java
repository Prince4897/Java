package Menu;
import java.util.Scanner;

public class Restraunt {
	

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
//MENU
		//while(true)
		int x=1;
		do{
			
			System.out.println("Enter 1 for Breakfast Meal(20rs)");
			System.out.println("Enter 2 for Lunch Meal,30rs");
			System.out.println("Enter 3 for Dinner Meal,40rs");
			System.out.println("Enter 4 for Light Snacks Meal,50rs");
			System.out.println("Enter 5 for Junk Meal,60rs");
			System.out.println("Enter 9 to exit,0rs ");
			
			System.out.println("Enter your choice");
			int choice=scan.nextInt();
			
			switch(choice) {
			
			case 1:System.out.println("BREAKFAST MEAL");
				Breakfast();
			break;
			case 2:System.out.println("LUNCH MEAL");
				Lunch();
			break;
			case 3:System.out.println("DINNER MEAL");
			Dinner();
			break;
			case 4:System.out.println("LIGHT SNACKS MEAL");
			LightSnacks();
			break;
			case 5:System.out.println("JUNK MEAL");
			Junk();
			break;
			case 6:System.out.println("Thankyou for visiting");
			System.exit(0);
			break;
			default:System.out.println("INCORRECT CHOICE");
			}
		}while(x<0);
	}
	
	
	public static void Breakfast() {
		System.out.println("How many Breakfast buffet(s) you want?");
		Scanner scan = new Scanner(System.in);
		int qty = scan.nextInt();
		System.out.println("Bill is"+(qty*20));
		/*public void CalBill() {
			System.out.println("bill is"+(qty*20));
		}*/
		
	}
	
	
	public static void Lunch() {
		System.out.println("How many Lunch buffet(s) you want?");
		Scanner scan = new Scanner(System.in);
		int qty = scan.nextInt();
		System.out.println("Bill is"+(qty*30));
		
	}
	
	public static void Dinner() {
		System.out.println("How many Dinner buffet(s) you want?");
		Scanner scan = new Scanner(System.in);
		int qty = scan.nextInt();
		System.out.println("Bill is"+(qty*40));
		
	}

	public static void LightSnacks() {
		System.out.println("How many LightSnacks buffet(s) you want?");
		Scanner scan = new Scanner(System.in);
		int qty = scan.nextInt();
		System.out.println("Bill is"+(qty*50));
		
	}

	public static void Junk() {
		System.out.println("How many Junk buffet(s) you want?");
		Scanner scan = new Scanner(System.in);
		int qty = scan.nextInt();
		System.out.println("Bill is"+(qty*60));
		
	}


	public void CalBill() {
		// TODO Auto-generated method stub
		
	}

	
		

	
	
}




