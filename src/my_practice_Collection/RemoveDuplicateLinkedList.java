package my_practice_Collection;

import java.util.LinkedList;

public class RemoveDuplicateLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(123);
		list.add(123);
		list.add(124);
		list.add(123);
		list.add(123);
		list.add(123);
		LinkedList<Integer> list1 = new LinkedList<>();
		for (Integer i : list) {
			int count = 0;
			for (Integer j : list) {
				if (i == j) {
					count++;
				}
			}
			if (count > 1) {
				if (list1 != null) {
					int iterater = 0;
					for (Integer k : list1) {
						if (i == k) {
							iterater++;
						}
					}

				} else {
					list1.add(i);
				}
			}

		}
		System.out.println(list1);
	}
}
