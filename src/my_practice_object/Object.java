package my_practice_object;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Object implements Cloneable,Serializable {
	
	transient  int i=9;
	//  How many ways to create objetcs in java
	public static void main(String[] args) throws Exception {
		System.out.println();
		// 1. new keyword
		Object object=new Object();
		System.out.println(object);
		System.out.println(object.i);
		// 2. new instance
		Object object2=(Object) Class.forName("my_practice_object.Object").newInstance();
		System.out.println(object2);
		
		// 3. clone
		Object object3=(Object)object.clone();
		System.out.println(object3);
		
		// 4. serializable 
		FileOutputStream stream=new FileOutputStream("serial.ser");
		ObjectOutputStream outputStream=new ObjectOutputStream(stream);
		outputStream.writeObject(object);
		
		FileInputStream fileInputStream=new FileInputStream("serial.ser");
		ObjectInputStream inputStream=new ObjectInputStream(fileInputStream);
	    Object object4 =(Object)inputStream.readObject();
	    System.out.println(object4);
	    System.out.println(object4.i);
	    // 5.by method
	    Object object5=object4.createObject();
	    System.out.println(object5);
		

	}
	public Object createObject() {
		return new Object();
	}

}
