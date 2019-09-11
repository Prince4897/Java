package test;

abstract public class Animal {

	abstract void sound();
	public void eat()
	{
		
	}
	
	
public static void main(String [] args){
	
	Animal a1=new Dog();
	a1.sound();
	a1.eat();
	Animal a2=new Cat();
	a2.sound();
	a2.eat();
}
}