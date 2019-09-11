
class interfce extends lala implements intrfce,scndintrfc
{
	public void display()
	{
		System.out.println("Hey");
	}
	
	@Override
	public void print() 
	{
		System.out.println("Print function");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interfce i=new interfce();
		//lala q=new interfce();
		i.display();
		i.print();
		i.syso();
		i.sys();
	}

	@Override
	public void sys() {
		// TODO Auto-generated method stub
		System.out.println("Abstract method");
	}

	

}
