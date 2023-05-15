package my_interface;


public class A  extends Exception{
	
}
class B extends A{
	
}
class Main{
	public static void main(String[] args) {
		try {
			throw new  B();
		} catch (A e) {
			System.out.println("a");
			// TODO: handle exception
		}
	}
	
}
