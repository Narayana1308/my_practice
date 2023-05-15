package my_practice_Collection;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.Vector;

public class VectorPract {
	public static void main(String[] args) {
		Vector<Integer> vector=new Vector<>();
		vector.add(12);
		vector.add(13);
		vector.add(14);
		vector.add(12);
//		boolean b= vector.add(12);
//		vector.addElement(null);
//		vector.add(1, 123);
//		vector.addElement(12);
//		System.out.println(b);
//		System.out.println(vector);
//		Iterator<Integer> iterator=vector.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//		System.out.println(vector.get(2));
//		System.out.println(vector.indexOf(123));
//		;
//		System.out.println(vector.capacity());
//		System.out.println(vector.size());
		TreeSet<Integer> vector2=new TreeSet();
		for(Integer integer:vector) {
			int count=0;
			for(Integer jInteger :vector) {
				if(integer==jInteger) {
					count++;
				}
			}
			if(count>1) {
				vector2.add(integer);
			}
		}
		System.out.println(vector2);
		for(Integer integer:vector2) {
			//int kInteger=integer;
			vector.remove(integer);
//			vector.add(kInteger);
		}
		System.out.println(vector);
		
	}

}
