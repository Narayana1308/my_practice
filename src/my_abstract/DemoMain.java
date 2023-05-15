package my_abstract;

public class DemoMain {
	public static void main(String[] args) {

		int demoMain=new Demoo() {
			
			@Override
			int m2(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}
		}.m2(1, 2);
		
		
	}
}
