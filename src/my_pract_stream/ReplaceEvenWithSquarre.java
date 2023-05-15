package my_pract_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReplaceEvenWithSquarre {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 3, 2, 4, 5, 6);
		 integers.stream().filter(n->n%2==0).mapToDouble(n->Math.sqrt(n)).forEach(System.out::println);

		// sorting the name
		List<String> name = Arrays.asList("abc", "ze", "as");
		List<String> list = name.stream().sorted().collect(Collectors.toList());
		System.out.println(list);
		// List products sorting desceding order
		List<Product> list2 = new ArrayList<>();
		list2.add(new Product("aa", "aa", 120));
		list2.add(new Product("q2", "f", 10));
		List<Product> p = list2.stream().sorted((e1, e2) -> {
			return (int) e2.getPrice() - (int) e1.getPrice();
		}).collect(Collectors.toList());

		System.out.println(p);
		// List of Emp asceding on sal

		List<Emp> emps = new ArrayList<>();
		emps.add(new Emp(1, "as", "oo", 1221));
		emps.add(new Emp(1, "as", "oo", 121));
		emps.add(new Emp(1, "as", "oo", 1021));
		emps.add(new Emp(1, "as", "oo", 1321));

		List<Emp> p1 = emps.stream().sorted((s1, p2) -> {
			return (int) p2.getSal() - (int) s1.getSal();
		}).collect(Collectors.toList());

		System.out.println(p1);

		// sorting books based on author
		List<Book> books = new ArrayList<>();
		books.add(new Book(1, "James"));
		books.add(new Book(2, "Gousling"));
		books.add(new Book(3, "Rajamouili"));

		List<Book> wBooks = books.stream().sorted((b, b1) -> b.getAuthor().compareTo(b1.getAuthor()))
				.collect(Collectors.toList());

		System.out.println(wBooks);

		
		//desceding grade 
		List<Student> students = new ArrayList<>();
		students.add(new Student(1, "s", 'A'));
		students.add(new Student(1, "s", 'B'));
		students.add(new Student(1, "s", 'C'));
		students.add(new Student(1, "s", 'D'));
		List<Student> list3 = students.stream().sorted((s, s1) -> s1.getGrade() - s.getGrade())
				.collect(Collectors.toList());
		System.out.println(list3);

	}

}
