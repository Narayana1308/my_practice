package my_practice_Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


public class CapacityList {
	public static void main(String[] args) {
		ArrayList list=new ArrayList<>();
		System.out.println(list.size());
		LinkedList<Integer> linkedList2=new LinkedList<>();
		for(int i=0;i<7;i++) {
			
			linkedList2.add(i);
		}
		//Iterator<Integer> iterator=linkedList.iterator();
		Iterator<Integer> iterator2=linkedList2.descendingIterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
	}

}
