package my_practice_Collection;

import java.util.Comparator;

public class SortByEmpName implements Comparator<Object> {



	@Override
	public int compare(Object o1, Object o2) {
	Employe employe=(Employe)o1;
	Employe employe2=(Employe)o2;
		return employe.getName().compareTo(employe2.getName());
	}
	


}
