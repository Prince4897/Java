package threadpack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerialize {
public static void main(String[] args) throws IOException, ClassNotFoundException{
	book b1=new book(1201,"The compiler reference","Herber",600);
	
	
	try {
		
		FileOutputStream fos=new FileOutputStream("book.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(b1);
		System.out.println("successfully serialised");
		FileInputStream fis=new FileInputStream("book.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		book mybook=(book) ois.readObject();
		System.out.println("Book successfully retreived");
		System.out.println("After serialisation"+mybook);
		
		
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
		// TODO: handle exception
	}
	
}
	
}
