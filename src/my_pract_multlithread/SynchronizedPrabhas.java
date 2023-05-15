package my_pract_multlithread;

public class SynchronizedPrabhas {
	public synchronized void show(String name) {
		for(int i=0;i<10;i++) {
		System.out.println("Darling...");
		
		try {
			Thread.sleep(1000);
			
		
		} catch (InterruptedException e) {
			
			// TODO: handle exception
		}
		System.out.println(name);
		}
	}

}
