package my_pract_stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;

public class Arrayyy {
	public static void main(String[] args) {
		int[] a = { 1, 2, 2, 2, 4 };

		int sum = Arrays.stream(a).sum();
		System.out.println(sum);
		IntStream s = Arrays.stream(a).filter(s1 -> s1 % 2 == 0);
        System.out.println(s);
		Map<Integer, String> m = new HashMap<>();
		Set set = m.entrySet();
		System.out.println(set);
	}

}
