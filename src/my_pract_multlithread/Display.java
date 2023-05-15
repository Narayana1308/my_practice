package my_pract_multlithread;

public class Display {
	
	public synchronized void number() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(6000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	public  synchronized void character() {
		for(int i=65;i<75;i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(10000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
