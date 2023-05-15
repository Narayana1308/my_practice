package my_pract_serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Emp  implements Cloneable{
	private int id;
	private String name;
	private String email;
	private transient String pwd;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	private void writeObject(ObjectOutputStream objectOutputStream) throws Exception {
		
		objectOutputStream.defaultWriteObject();
		String epwd="123"+getPwd();
		objectOutputStream.writeObject(epwd);
	}
	private void readObject(ObjectInputStream inputStream) throws Exception, IOException {
		inputStream.defaultReadObject();
		String epwd=(String) inputStream.readObject();
		pwd=epwd.substring(3);
		
	}
	public Emp(int id, String name, String email, String pwd) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.pwd = pwd;
	}
	
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		return super.clone();
//	}
	
	
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	

}
