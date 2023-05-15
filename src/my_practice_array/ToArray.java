package my_practice_array;

import java.util.*;

public class ToArray {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(121);
		list.add(211);
		Integer[] i =  list.toArray(new Integer [list.size()] );
		
		
		for(Integer integer:i) {
			System.out.println(integer);
		}

	}
	

}
