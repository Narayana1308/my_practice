package my_pract_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ListProductLessThan3k {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product("aa", "as", 29));
		list.add(new Product("ssa", "ss", 31009));
		list.add(new Product("ss", "ew", 40001));
		list.add(new Product("aa", "as", 11000));
		list.add(new Product("ssa", "ss", 2000));
		
	double na=	list.stream().filter(pro->(pro.getPrice()%2==0)).mapToDouble(n->n.getPrice()).sum();
	System.out.println(na);
		
		
		
		
//	list.stream().filter(pro->pro.getPrice()>3000 && pro.getPrice()<5000).forEach(System.out::println);
//	
//	int list2=(int) list.stream().filter(pro->pro.getPrice()<3000 ).count();
//	System.out.println(list2);
//		Product product = list.stream().max((pro1, pro2) -> ((int) pro1.getPrice() - (int) pro2.getPrice())).get();
//		System.out.println(product);
//		
//		Product product2=list.stream().min((pro1,pro2)->(int)pro1.getPrice()-(int)pro2.getPrice()).get();
//		System.out.println(product2);
		
//		
//		for(Product product3:list) {
//			if(product3.getName().charAt(0)=='a') {
//				System.out.println(product3);
//			}
//		}
//		for(Product product3:list) {
//			if(product3.getName().startsWith("a")) {
//				System.out.println(product3);
//			}
//		}
		//list.stream().filter(pro->pro.getName().startsWith("s")).forEach(proo->System.out.println(proo));
		
		

	}

}
