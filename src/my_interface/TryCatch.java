package my_interface;

public class TryCatch {
	 
	public static void main(String[] args) {
		
		try {
			final int a=10/0;
			System.out.println(a);
		} catch (Exception e) {
			System.out.println("exception");
			// TODO: handle exception
		}
	}

}
