package my_pract_multlithread;

public class MainThread {
	volatile int a=12;
	public  static void main(String[] args) {
		MyThread myThread=new MyThread();
		//myThread.start();
		//myThread.run(21);
	//	System.out.println("main thread");
		//myThread.start();
		//myThread.start();
		Runn  runn=new Runn();
		runn.run();
	}

}
