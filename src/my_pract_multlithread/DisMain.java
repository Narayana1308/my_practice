package my_pract_multlithread;

public class DisMain {
	public static void main(String[] args) {
		
		Display display=new Display();
		
		DisChar char1=new DisChar(display);
		DisNum num=new DisNum(display);
		char1.start();
		num.start();
		
		
		
	}

}
