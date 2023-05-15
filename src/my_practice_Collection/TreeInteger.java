package my_practice_Collection;

import java.util.Comparator;

public class TreeInteger implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Integer integer=(Integer)o1;
		Integer integer2=(Integer)o2;
		return integer2.compareTo(integer);
	}
	

}
