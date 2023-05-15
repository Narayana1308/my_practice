package my_practice_Collection;

import java.util.LinkedList;

public class LinkedListPract {
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(null);
		list.add(null);
		list.addFirst(null);
	
		System.out.println(	list.get(0));

		System.out.println(list);
	}

}
