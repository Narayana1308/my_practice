package my_pract_basic;

public  class Child  extends Super{
	int id=9898;

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("my child");
		//super.m1();
	}

	public static void main(String[] args) {
		Child child=new Child();
		child.m2();
	}
	
	
	
	
	public void m2() {
		int idd=this.id;
				
	System.out.println(this.id);
		m1();
		System.out.println(id);
		System.out.println();
		super.m1();
		System.out.println(super.id);
	}

	public  Child() {
		super();
		this.id = id;
	}
	

}
