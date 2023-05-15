package my_practice_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveAndAdd {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		//list.add(3, 23);
		  list.add(12);
         list.add(0);
         list.add(1);
         list.add(78);
         list.add(12);
        
         list.add(5, 23);
         System.out.println(list);
         list.remove(0);
         System.out.println(list);

		for(Integer integer:list) {
			System.out.println(integer);
		}
//		list.remove(list.get(0));
//		System.out.println(list);
	}

}
