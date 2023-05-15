package my_pract_multlithread;

public class A_Dead {
	
	public synchronized void m1(B_Dead dead) {
		System.out.println("A_Dead ");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("b dead last method");
		dead.last();
		
	}

	public synchronized  void last() {
		// TODO Auto-generated method stub
	System.out.println("last from a dead");	
	}

}
