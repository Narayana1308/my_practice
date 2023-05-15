package my_pract_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMap1 {
	public static void main(String[] args) {
		HashMap<Integer,String> hashMap=new HashMap<>();
		hashMap.put(10, "tram");
		hashMap.put(11, "manoj");
		hashMap.put(101, "prabhas");
		
		
		Map<Integer,String> map=new TreeMap<Integer, String>(hashMap);
		System.out.println(map);
		Set set=hashMap.entrySet();
		Iterator iterator=set.iterator();
		while(iterator.hasNext()) {
			Map.Entry<Integer, String> entry=(Entry<Integer, String>) iterator.next();
		if(entry.getValue().equals("prabhas") &&entry.getKey()==101) {
			entry.setValue("darling");
		}
		}
		System.out.println(hashMap);
	}

}
