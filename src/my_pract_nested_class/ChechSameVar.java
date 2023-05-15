package my_pract_nested_class;

public class ChechSameVar {
	int x=100;
	class Inner{
		int x=9;
		public void m1() {
			int x=11;
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(ChechSameVar.this.x);
			System.out.println("inner m1");
		}
	}
	public static void main(String[] args) {
		new ChechSameVar().new Inner().m1();
		new ChechSameVar().m1();
	}
	public void m1() {
		System.out.println("ouuter m1");
	}

}
