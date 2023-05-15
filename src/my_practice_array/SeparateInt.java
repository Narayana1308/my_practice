package my_practice_array;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

public class SeparateInt {
	public static void main(String[] args) {
		Object[] objects = { 21, "vgf", 32, 'f', "fff", 3434 };

//		for(int i=0;i<objects.length;i++) {
//			if(objects[i] instanceof Integer) {
//				System.out.println(objects[i]);
//			}
//			
//			
//		}
//		
		List<Integer> list = new ArrayList<>();
		;
		;
		;
		list.add(13);
		list.add(3121);
		list.add(13);
		list.add(13);
		list.add(3121);
		list.add(13);
//		list.add(3232);
//		list.add(3232);
		Iterator<Integer> iterator = list.iterator();
		System.out.println(list);
	try {
		while (iterator.hasNext()) {
			Integer integer=iterator.next();
			System.out.println(integer);
			if (integer.equals(13)) {
				
				System.out.println(integer);
				//list.remove(integer);
				iterator.remove();
				
			//	System.out.println(iterator.next());
			}

		}
		
	} catch (ConcurrentModificationException e) {
		// TODO: handle exception
		e.printStackTrace();
		e.getCause();
		e.getMessage();
	}
//		for (Integer integer : list) {
//			if (integer.equals(13)) {
//				list.remove(integer);
//			}
//		}
		System.out.println(list);

	}

}
