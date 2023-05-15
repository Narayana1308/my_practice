package my_pract_lambda;

import java.util.function.Predicate;

public class Predica1 {

	public static void main(String[] args) {
		
		Predicate<Integer> i=a->a%2==0;
		System.out.println("Even Number :"+i.test(212));
		Predicate<String> string=(String s)->s.length()>=5;
		System.out.println(string.test("Narikjka"));
	}
}
