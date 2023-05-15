package my_practice_Collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Vector1 {
	public static void main(String[] args) {
		Vector<Integer> t=new Vector<>();
		t.add(12);
		t.add(1);
		t.addElement(12);
		Enumeration< Integer> iEnumeration=t.elements();
		while(iEnumeration.hasMoreElements()) {
			System.out.println(iEnumeration.nextElement());
		}
		Iterator<Integer> liIterator=t.iterator();
		while(liIterator.hasNext()) {
			System.out.println(liIterator.next());
			
		}
		ListIterator<Integer > iterator=t.listIterator();
		while(iterator.hasPrevious()) {
			System.out.println(iterator.next());
		}
		System.out.println(t);
		List<Character> list=new ArrayList<>();
		list.add('j');
		System.out.println(list);
	}

}
