package my_practice_Collection;

import java.util.ArrayList;
import java.util.List;

public class BookMain {
	public static void main(String[] args) {
		Book book = new Book();
		book.setId(1);
		book.setNameString("name");
		book.setPrice(5020);

		Book book1 = new Book();
		book1.setId(2);
		book1.setNameString("name");
		book1.setPrice(220);

		Book boo = new Book();
		boo.setId(3);
		boo.setNameString("java");
		boo.setPrice(8250);

		Book bok1 = new Book();
		bok1.setId(4);
		bok1.setNameString("titanic");
		bok1.setPrice(4566);

		List<Book> books = new ArrayList<>();
		books.add(book);
		books.add(book1);
		books.add(bok1);
		books.add(boo);

		long max = 0;
		Book book2 = null;

		max = books.get(0).getPrice();
		for (int i = 0; i < books.size(); i++) {
//			System.out.println(books.get(i));
			for (int j = i + 1; j < books.size(); j++) {
				if (books.get(j).getPrice() > max) {
					max = books.get(j).getPrice();
					book2 = books.get(j);
				}
			}
		}

		if (max == 0) {
			System.out.println("List is empty");

		} else {
			System.out.println(max);
			System.out.println(book2);
		}

	}

}
