package my_practice_Collection;

import java.util.TreeSet;

public class TreeSetString {
	public static void main(String[] args) {
		TreeSet<String> tree=new TreeSet<>();
		tree.add("narayana");
		tree.add("puspa");
		tree.add("anantha");
		tree.add("sr");
		System.out.println(tree);
		for(String name:tree) {
			System.out.println(name);
		}
	}

}
