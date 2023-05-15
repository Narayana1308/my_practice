package my_practice_Collection;

import java.util.HashSet;
import java.util.Set;

public class SetString {
	public static void main(String[] args) {
		HashSet<String> set=new HashSet<>();
	     set.add("narayana");
	     set.add("sravan");
	     set.add("sudhakar");
	     set.add("srinu");
	     set.add("narayan");
	     set.add("srava");
	     set.add("sudhaka");
	     set.add("srin");
	     System.out.println(set);
	     for(String name:set) {
	    	 System.out.println(name);
	     }
	     
	  //insertion order is not maintained
	     //
	}

}
