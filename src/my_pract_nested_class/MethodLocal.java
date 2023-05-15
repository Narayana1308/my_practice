package my_pract_nested_class;

public class MethodLocal {

	public  void m1() {
		int x =788;
		final int y=99;
		class My {
//			int x=99;
//			int y=9898;

			public void m2() {
				System.out.println(x);
				System.out.println(y);
			}
		}
		My my=new My();
		my.m2();

	}

	public static void main(String[] args) {
		MethodLocal local = new MethodLocal();
		local.m1();
	}

}
