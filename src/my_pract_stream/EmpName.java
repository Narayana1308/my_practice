package my_pract_stream;

import java.util.Comparator;

public class EmpName  implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		Emp emp=(Emp) o1;
		Emp emp2=(Emp)o2;
		return emp.getNameString().compareTo(emp2.getNameString());
	}

}
