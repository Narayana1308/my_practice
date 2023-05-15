package my_pract_stream;

import static org.junit.jupiter.api.DynamicTest.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfString {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Ajay");
		list.add("Akash");
		list.add("Bam");
		list.add("Rakesh");
		list.add("Srr");
		list.add("RRR");
		//Collections.sort(list);
		List<String> list2 = new ArrayList<>();
		for (String name : list) {
			if (name.charAt(0)!='A') {
				list2.add(name);
			} 
		}
		for(String s:list2)
			list.remove(s);
		System.out.println(list);
		
		
		
//		for (String name : list) {
//			if (name.startsWith("A")) {
//				list2.add(name);
//			} 
//
//		}
//		System.out.println(list2);
		
	List<String> nam=	list.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList());
	System.out.println(nam);
	System.out.println();

	}

}
