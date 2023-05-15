package my_pract_lambda;

import java.util.function.Predicate;

public class PredicateArray {
	public static void main(String[] args) {
		int [] a= {1,2,3,45,6,7,8};
		
		Predicate<Integer> iPredicate=i->i%2==0;
		Predicate<Integer> Predicate=i->i>4;
		
		for(Integer i:a) {
			if(Predicate.and(iPredicate).test(i)) {
				System.out.print(i+" ");
			}
			
		}
		System.out.println();
		for(Integer i:a) {
			if(Predicate.or(iPredicate).test(i)) {
				System.out.print(i+" ");
			}
			
		}
		System.out.println();
		for(Integer i:a) {
			if(iPredicate.negate().test(i)) {
				System.out.print(i+" ");
			}
			
		}
		System.out.println();
		for(Integer i:a) {
			if(Predicate.negate().test(i)) {
				System.out.print(i+" ");
			}
			
		}
		System.out.println();
		
		
		
		
	}

}
