package my_interface;

public class FunctionMain {
	public static void main(String[] args) {
		FunctionalInterface interface1=(a,b)->{
			System.out.println("display method");
		};
		interface1.display(1, 2);
	
	}

}
