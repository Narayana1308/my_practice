package my_practice_Collection;

import java.util.LinkedHashSet;

public class LinkedHashsettt {
	public static void main(String[] args) {
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		set.add(121);
		set.add(13);
		set.add(12);
		set.add(null);
		set.add(null);
		System.out.println(set);
		System.out.println(set.remove(12));
		System.out.println(set);
	}

}
