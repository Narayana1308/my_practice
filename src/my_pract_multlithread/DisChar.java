package my_pract_multlithread;

public class DisChar extends Thread{ 
	
	Display display;
	
	
	public DisChar(Display display) {
		super();
		this.display = display;
	}


	public void run() {
		display.character();
	}

}
