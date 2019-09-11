package test;

	public class Aeroplane implements flyingObject,flyingVehicles{
		public void wings(){
			
			System.out.println("Aeroplane has 2 wings");
			//qty*20;
			//print qty*20
			
		}
			public void fly(){
			
				System.out.println("Aeroplane is flying");
				
			}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aeroplane a1=new Aeroplane();
		a1.fly();
		a1.wings();
		
		
		
	}


	
}