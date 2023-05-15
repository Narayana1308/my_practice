package my_practice_Collection;

import java.util.Comparator;

public class MyComparator  implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		String nString=(String)o1;
		String strin=(String)o2;
		return nString.compareTo(strin);
	}

}
