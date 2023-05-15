package my_practice_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

import org.junit.platform.engine.support.descriptor.FileSystemSource;

public class MapStart {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		//map.put(null, null);
		map.put(10, "naiii");
		map.put(101, "naiini");
		map.put(201, "naiii");
		map.put(1, "naraiiii");
		
		
		
		
		
		
		
		
		
		
		
		//System.out.println(map.keySet());
	    Set<Integer> set=map.keySet();
	    List<Integer> integers=new ArrayList<>(set);
	    Collections.sort(integers);
	    for(Integer in:integers) {
	    	map.get(in);
	    	System.out.println(map.get(in)+" ");
	    }
	    
	    
	    
//	    set.stream().sorted().forEach(System.out::println);
//	    Collection<String> collection=map.values();
//	    collection.stream().sorted().forEach(System.out::println);
////	    System.out.println(set);
////	    Collection<String> set1=map.values();
//	    List<Integer> list=new ArrayList<>(set);
//	    List<String> sList=new ArrayList<>(set1);
//	    System.out.println(sList);
//	    System.out.println(list);
//	    Collections.sort(list);
//	    for(Integer integer:list) {
//	    	System.out.println(integer);
//	    }
//	    Collections.sort(sList);
//	    for(String name:sList) {
//	    	System.out.println(name);
//	    }
//	    System.out.println(map);
//	}
	}
}
