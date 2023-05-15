package my_practice_Collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashVsTreeMap {
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap=new HashMap<>();
		hashMap.put(12, "black");
		hashMap.put(10, "red");
		hashMap.put(8, "orange");
		hashMap.put(null, null);
		for(Map.Entry<Integer, String> entry:hashMap.entrySet()) {
			System.out.println(entry.getKey() +" "+entry.getValue());
		}
		Map<String,Integer> map=new TreeMap<>();
		map.put( "black",12);
		map.put("red",122);
		map.put("orange",122);
		map.put("rgfg", null);
		for(Entry<String, Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey() +" "+entry.getValue());
		}
		System.out.println(map);
		TreeMap<String, Integer> map2=new TreeMap<>();
		Hashtable<String, Integer> hashtable=new Hashtable<>();
		hashtable.put("AJA",1222);
		hashtable.put("RAM", 122);
		//hashtable.put(null, null);
		hashtable.put("RAM", 12);
		System.out.println(hashtable);
		
	}

}
