package my_pract_nested_class;

import my_pract_controller_statements.Main;

public class ClassInsideMethod {
	public void demo() {
		
		class MyClass{
			public void sum(int z,int y) {
				System.out.println("Summtion :"+(z+y));
			}
			
		}
	MyClass class1=new MyClass();
	class1.sum(12, 10);
	
		
		
		
	}
	public static void main(String[] args) {
		ClassInsideMethod method=new ClassInsideMethod();
		method.demo();
	}
	

}
