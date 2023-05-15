package my_pract_stream;

import java.util.ArrayList;
import java.util.List;

public class ProductSortByPrice {
	public static void main(String[] args) {
		List<Product> list=new ArrayList<>();
		list.add(new Product("aa", "as", 20));
		list.add(new Product("ssa", "ss", 300));
		list.add(new Product("ss", "ew", 400));
		list.add(new Product("aa", "as", 110));
		list.add(new Product("ssa", "ss", 200));
		double total11=0;
		for(Product product:list) {
			total11+=product.getPrice();
		}
		System.out.println(total11);
		
		double totalprice= list.stream().mapToDouble(total ->total.getPrice()).sum();
		System.out.println(totalprice);
		
		
	}

}
