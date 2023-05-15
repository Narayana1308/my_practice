package my_pract_serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmpMain {
	public static void main(String[] args) throws Exception {
		Emp emp=new Emp(1, "nasraysh", "nari", "1234");
		
		
		FileOutputStream fileOutputStream=new FileOutputStream("abc.nari");
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(emp);
		
		
		FileInputStream fileInputStream=new FileInputStream("abc.nari");
		ObjectInputStream inputStream=new ObjectInputStream(fileInputStream);
		Emp emp2=(Emp)inputStream.readObject();
		
		System.out.println(emp2.getName()+" "+emp2.getPwd());
		
		
		
	}

}
