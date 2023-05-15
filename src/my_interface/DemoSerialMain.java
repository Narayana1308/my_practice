package my_interface;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DemoSerialMain {

	public static void main(String[] args) throws Exception {
		DemoForSerial demoForSerial=new DemoForSerial();
		
		FileOutputStream stream=new FileOutputStream("serial.ser");
		ObjectOutputStream output=new ObjectOutputStream(stream);
		output.writeObject(demoForSerial);
		
		FileInputStream stream2=new FileInputStream("serial.ser");
		ObjectInputStream inputStream=new ObjectInputStream(stream2);
	    DemoForSerial forSerial=(DemoForSerial)inputStream.readObject();
	    
		System.out.println(forSerial.a);
		System.out.println(demoForSerial.a);
		System.out.println(forSerial.nameString);
		System.out.println();
		System.out.println(demoForSerial.nameString);
		
	}
}
