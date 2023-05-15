package my_practice_Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class HashMapIntro {
	public static void main(String[] args) {
//		Map<Integer, String> map=new HashMap<>();
//		map.put(1, "ram");
//		map.put(13,"ja");
//		map.put(12, "aka");
//		map.put(null, ":jnj");
//		map.put(null, null);
//		Map<Integer, String> map2=new TreeMap<Integer, String>();
//		System.out.println(map2);
//		System.out.println(map);
		Map<String, Integer> map = new HashMap<>();
		map.put("ram", 12);
		map.put("ajaa", 221);
		map.put("rahul", 121212);

		System.out.println(map);
		Set<String> set1 = map.keySet();
		TreeSet<String> set = new TreeSet<>(set1);
		set.descendingSet();
		System.out.println(set.descendingSet());
		System.out.println(set);
		set.stream().sorted().forEach(System.out::println);

		Collection<Integer> collection = map.values();
		TreeSet<Integer> integers=new TreeSet<>(collection);
		integers.descendingSet();
		System.out.println(integers.descendingSet());
		System.out.println(integers);
		collection.stream().sorted().forEach(System.out::println);

		System.out.println(map);

	}

}
