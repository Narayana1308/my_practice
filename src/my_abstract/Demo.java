package my_abstract;

public class Demo {
	interface A {
		int a = 12;

		default void ma() {
			System.out.println("interface");
		}

		public static void main(String[] args) {
			System.out.println("hiiii");
		}
	}

	class D implements A{
		
		
		
	}
	public static void main(String[] args) {
		System.out.println("mainn");
		System.out.println(A.a);
	}

}
