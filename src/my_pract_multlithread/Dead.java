package my_pract_multlithread;

public class Dead  extends Thread{

	A_Dead a_Dead=new A_Dead();
	B_Dead b_Dead=new B_Dead();
	
	public void m1() {
		this.start();
		a_Dead.m1(b_Dead);
		System.out.println("m1()");
	}
	public void run() {
		b_Dead.m1(a_Dead);
		System.out.println("run method");
	}
}
