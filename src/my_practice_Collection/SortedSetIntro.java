package my_practice_Collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetIntro {
	public static void main(String[] args) {
		TreeSet<Integer> set=new TreeSet<>();
		set.add(12);
		set.add(13);
		set.add(14);
		set.add(1);
		//set.add(null);
		//set.add(null);
		set.add(1);
		System.out.println(set.comparator());
		System.out.println(set);
		SortedSet<Integer> sort=new TreeSet<Integer>();
		sort.add(12);
		sort.add(10);
		sort.add(13);
		sort.add(14);
		sort.add(15);
		//sort.add(null);
		System.out.println(sort.first());
		System.out.println(sort.last());
		System.out.println(sort.headSet(13));;
		System.out.println(sort.tailSet(14));
		System.out.println(sort.subSet(13, 15));
		System.out.println(sort);
		
		
	}

}
