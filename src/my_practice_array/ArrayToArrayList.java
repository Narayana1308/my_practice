package my_practice_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;

public class ArrayToArrayList {
	public static void main(String[] args) {
		Integer [] a= {1,2,3,4,5};
		
		List<Integer> list=Arrays.asList(a);
	    for(Integer i:list) {
	    	System.out.println(i);
	    }
		
		
		
		
	}

}
