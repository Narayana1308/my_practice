package my_practice_array;

import java.util.Arrays;

public class Arra {
	public static void main(String[] args) {
		
		
		int[] i={32,55,1,77};
		
		
		System.out.println(Arrays.toString(i));
		
		Arrays.parallelSort(i);
		Arrays.sort(i);
		System.out.println(Arrays.binarySearch(i, 77));
		
		System.out.println(Arrays.toString(i));
		
	}

}
