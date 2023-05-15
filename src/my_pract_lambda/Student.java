package my_pract_lambda;

public class Student {
	private String name;
	private double sal;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", sal=" + sal + ", address=" + address + "]";
	}
	public Student(String name, double sal, String address) {
		super();
		this.name = name;
		this.sal = sal;
		this.address = address;
	}
	
	

}
