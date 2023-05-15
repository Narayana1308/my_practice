package my_pract_List;

import java.util.Comparator;

public class NameSortDesce  implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1=o1.toString();
		String s2=o2.toString();
		
		return s2.compareTo(s1); 
	}

}
