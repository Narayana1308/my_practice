package my_practice_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListReverse {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(12);
		list.add(13);
		list.add(4);
		list.add(15);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
		
	}

}
