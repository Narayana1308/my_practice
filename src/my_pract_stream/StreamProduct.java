package my_pract_stream;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamProduct {
	public static void main(String[] args) {
		Set<Product> products = new HashSet<>();
		products.add(new Product("phone", "vivo", 1200));
		products.add(new Product("vi", "aa", 200));
		products.add(new Product("aa", "oo", 12000));
		products.add(new Product("ll", "nb", 10001));
		products.add(new Product("iphone", "kk", 20000));

		// .stream();

		Set<Product> pr = products.stream().filter(pre -> pre.getPrice() > 10000).collect(Collectors.toSet());
		System.out.println(pr);
		long l = products.stream().count();
		// System.out.println(products);
		System.out.println(l);
		System.out.println(products.stream().distinct());
		Set<Product> products2 = products.stream().distinct().collect(Collectors.toSet());
		System.out.println(products2);
	     pr.stream().findFirst();

	}

}
