package my_practice_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapPra {
	public static void main(String[] args) {
		TreeMap<Integer, String> map=new TreeMap<>();
		map.put(1, "na");
		map.put(2, null);
		map.put(2, "na");
		map.put(4, null);
		System.out.println(map);
		Set<Integer> set=map.keySet();
		System.out.println(set);
		List<Integer> list=new ArrayList<>(set);
		System.out.println(list);
		Collections.reverse(list);
		for(Integer integer:list) {
			System.out.print(integer+", ");
		}
	}

}
