package Test;

import java.util.Comparator;

public class Emp  implements Comparator<Object>{

	int id;
	String nameString;
	
	public Emp(int id, String nameString) {
		super();
		this.id = id;
		this.nameString = nameString;
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Emp emp=(Emp)o1;
		Emp emp2=(Emp)o2;
		return emp.nameString.compareTo(emp2.nameString);
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", nameString=" + nameString + "]";
	}
	

}
