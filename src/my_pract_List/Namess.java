package my_pract_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import my_practice_Collection.EmpNameSorting;

public class Namess {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("ram");
		list.add("srav");
		list.add("srinu");
		list.add("nari");
		list.add("lakshmi");
		System.out.println(list);
		//Set<String> set=new TreeSet<String>(list);
		List<String> list2=new ArrayList<>(list);
		Collections.sort(list, new NameSortDesce());
		System.out.println(list);
	}
}
