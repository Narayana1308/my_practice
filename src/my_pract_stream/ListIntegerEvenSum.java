package my_pract_stream;

import java.util.ArrayList;
import java.util.List;

public class ListIntegerEvenSum {
	public static void main(String[] args) {
		List<Integer> integers=new ArrayList<>();
		integers.add(21);
		integers.add(12);
		integers.add(122);
		integers.add(13);
		
		int su= integers.stream().mapToInt(s->s).sum();
		System.out.println(su);
		int total= integers.stream().filter(s->s%2==0).mapToInt(s1 ->s1).sum();
		System.out.println(total);
		integers.stream().filter(s->s%2==0).forEach(n ->System.out.println(n));
		
		
		
		
	}

}
