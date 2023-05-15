package my_pract_stream;

public class Book {
	private int id;
	private String author;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Book(int id, String author) {
		super();
		this.id = id;
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", author=" + author + "]";
	}
	

}
