package my_practice_Collection;

import java.util.TreeSet;

public class TreeSetCostume {
	public static void main(String[] args) {
		TreeSet<Integer> set=new TreeSet<>(new TreeInteger());
		set.add(12);
		set.add(13);
		set.add(14);
		set.add(15);
		System.out.println(set);
	}

}
