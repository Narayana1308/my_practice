package my_pract_multlithread;

public class MyThread  extends Thread{
	public void run() {
		for(int i=0;i<5;i++)
		System.out.println("my thread");
	}
//	public void start() {
//		System.out.println("start");
//	}
//	public void run(int a) {
//		for(int i=0;i<5;i++)
//		System.out.println("my int");
//	}

}
