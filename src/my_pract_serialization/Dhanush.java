package my_pract_serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class Dhanush implements Externalizable {
	transient String naemString;
	int id;

	
	public Dhanush() {
		super();
		System.out.println("no arg construct");
	}

	public Dhanush(String naemString, int id) {
		super();
		this.naemString = naemString;
		this.id = id;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		
		out.writeObject(naemString);
		out.writeInt(id);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
	naemString=	(String) in.readObject();
	id=	in.readInt();
		
	}

}
