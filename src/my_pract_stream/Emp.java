package my_pract_stream;

public class Emp implements Comparable<Object> {
	private int id;
	private String nameString;
	private String company;
	private double sal;
	
	public Emp(int id, String nameString, String company, double sal) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.company = company;
		this.sal = sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", nameString=" + nameString + ", company=" + company + ", sal=" + sal + "]";
	}
	@Override
	public int compareTo(Object o) {
		Emp emp=(Emp)o;
		return (int) (this.sal-emp.getSal());
	}
	

}
