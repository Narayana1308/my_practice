package my_pract_stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class ProductInteger {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		
		list.stream().filter(num->num%2==0).mapToInt(num->num).sum();
		
		
		int aa= list.stream().filter(n->n%2==0).reduce(1,(a,b)->a*b);
		System.out.println(aa);
		
		Map<Integer, String> bMap=new HashMap<>();
		bMap.put(102, "SAAILA");
		bMap.put(101, "RAJ");
		bMap.put(100, "Ajay");
		
		Set<Integer> integers=bMap.keySet();
	  integers.stream().sorted();
	  System.out.println(integers);
	  Collection<String> collections=bMap.values();
	  collections.stream().sorted();
	  Stream<String> string=collections.stream().parallel().sorted();
	  System.out.println(string);
		
		
	}

}
