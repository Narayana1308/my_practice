package my_pract_multlithread;

public class Movie extends Thread {
	SynchronizedPrabhas prabhas;
	String name;
	public Movie(SynchronizedPrabhas prabhas, String name) {
		super();
		this.prabhas = prabhas;
		this.name = name;
	}
	public void run() {
		prabhas.show(name);
	}
	
	

}
