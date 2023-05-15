package my_practice_array;

import java.util.Arrays;
import java.util.Collections;

public class ArraysClass {
	public static void main(String[] args) {
		Integer [] num= {100,4,6,99,22,454};
		
		//Arrays.sort(num);
		Collections.sort(Arrays.asList(num));
		for(int i:num) {
			System.out.print(i+" ");
		}
		
		//System.out.println(num[0]);
	}

}
