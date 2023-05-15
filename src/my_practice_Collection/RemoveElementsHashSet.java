package my_practice_Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveElementsHashSet {
	public static void main(String[] args) {
		Set<Integer> set=new HashSet<>();
		set.add(12);
		set.add(13);
		set.add(24);
		set.add(122);
		set.add(132);
		set.add(242);
		List<Integer> list=new ArrayList<>(set);
		for(Integer i:list) {
			if(i<21) {
			set.remove(i);	
			}
		}
		System.out.println(set);
	}

}
