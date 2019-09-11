package JavaExamples;

public class Emp {
	
	private int id;
	private String name;
public void setId(int id) {
	this.id=id;	
}

public int getId() {
	return id;
}

public void setName(String name) {
	this.name=name;
}

public String getname() {
	return name;
}


//}

/*public class GetProperty
{
*/	public static void main(String[] args) {
		Emp e1=new Emp();
		e1.setId(1);;
		e1.setName("Harish");
		System.out.println(e1.getId());
		System.out.println(e1.getname());
	}
}