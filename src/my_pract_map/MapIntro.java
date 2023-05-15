package my_pract_map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class MapIntro {
	public static void main(String[] args) {
//		Map map=new HashMap<>();
//		System.out.println(map.put(1222, "eshu"));
//		System.out.println(map.put(102, "nari"));
//		System.out.println(map.put(1222, "eshawr"));

		HashMap<Integer, String> hashtable=new HashMap<>();
		hashtable.put(11, "rsm");
		hashtable.put(2, "sds");
		hashtable.put(13, "jj");
		hashtable.put(null, null);
		System.out.println(hashtable);
		HashSet<Integer> hashSet=new HashSet<>();
		hashSet.add(12);
		hashSet.add(13);
		
	}

}
