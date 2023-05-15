package my_practice_Collection;

public class Book  {//implements //Comparable<Object>{
	private int id;
	private String nameString;
	private long price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	//@Override
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		Book book=(Book)o;
//		return (int) (this.price-book.price);
//	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", nameString=" + nameString + ", price=" + price + "]";
	}
	

}
