package my_practice_patterns;

import javax.management.loading.PrivateClassLoader;

import my_practice_patterns.Class_Nested.Name.Id.emplo;

public class Class_Nested {

	static class Name {
		String nameString = "narayana";

		static class Id {
			static class emplo {
				String nString = "hello";

			}
		}

//		public static void main(String[] args) {
//
//		}

	}

	final static class Demo {
		static int a;
		static int b;

		Demo(int a, int b) {
			this.a = a;
			this.b = b;
		}

		static {
			a = 12;
			b = 21;
		}

		static void m1() {
			System.out.println(a + b);
		}

		void m2() {
			System.out.println(a - b);
		}

	}

	class Demo1 extends emplo {
		void m3() {
			System.out.println("Demo1 is  extends from employe");
		}
	}

	public static void main(String[] args) {
		//
		Class_Nested class_Nested = new Class_Nested();
		Demo demo = new Demo(7, 7);
		Demo.m1();
		new Demo(8, 12).m2();
		// System.out.println(class_Nested.new Demo().nameString);
		class_Nested.new Demo1().m3();

	}

}
