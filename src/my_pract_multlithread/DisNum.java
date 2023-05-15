package my_pract_multlithread;

public class DisNum  extends Thread{
	
	Display display;
	
	public DisNum(Display display) {
		super();
		this.display = display;
	}

	public void  run() {
		display.number();
	}

}
