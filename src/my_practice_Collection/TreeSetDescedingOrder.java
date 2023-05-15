package my_practice_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class TreeSetDescedingOrder {
	public static void main(String[] args) {
		TreeSet<Integer> set=new TreeSet<>();
		set.add(123);
		set.add(12);
		set.add(14);
		set.add(12);
		System.out.println(set);
		TreeSet set2=(TreeSet) set.descendingSet();
		System.out.println(set2);
		System.out.println(set);
		//System.out.println(set2.getClass().getName());
		
		
	}

}
