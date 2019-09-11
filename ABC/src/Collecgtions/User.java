package Collecgtions;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 class user1 {
private String name;
private int age;

public user1(String name, int age) {
	this.name=name;
	this.age=age;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name=name;
}

public int getAge() {
	return age;
}
public void setAge(int age) {

	this.age=age;
}
}

public class User{
	public static void main(String[] args) {
		//List<user1>users=new ArrayList<>();
		/*users.add(new user1("Rajeev",25));
		users.add(new user1("John",35));
		users.add(new user1("Steev",45));
*/
		
		List<user1>name=new ArrayList<user1>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{	//name.add(sc.next());
			name.add(new user1(sc.next(),sc.nextInt()));
		}
		
		name.forEach(user->{
			System.out.println("Name:"+user.getName()+",Age:"+user.getAge());
		});

	}
}
