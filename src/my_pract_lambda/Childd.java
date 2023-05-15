package my_pract_lambda;

public interface Childd  extends Parentt {

//	public  static void m1() {
//		System.out.println("m1 from child interface");
//	}
	public static void main(String[] args) {
		System.out.println(Childd.a);
		Parentt.m1();
		//Childd.m1();
		//Childd.m1();
	}
}
