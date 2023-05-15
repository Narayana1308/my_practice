package my_pract_nested_class;

public class AnonymousExtendsClass {
	/*
	 * 1.Anonymous extends class 
	 * 2.anonymous class implements interface
	 * 3. anonymous class that define inside args   
	 * */
	public static void main(String[] args) {
		Darling darling=new Darling();
		darling.dar();
		Darling darling2=new Darling() {

			@Override
			public void dar() {
				System.out.println("Prabhasssss");
			}
			
			
			
		};
		darling2.dar();
	}
	
	
	

}
