package my_pract_lambda;

public class Parent {
	static int a=10;
	int b=13;
	public static void m1() {
		System.out.println("m1 static method from Parent");
	}

	public void m2() {
		System.out.println("m2 non static method from parent");
	}
    Parent() {
		// TODO Auto-generated constructor stub
    	System.out.println("hello my world");
    	m2();
    	m1();
	}
}
