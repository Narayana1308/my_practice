package my_pract_basic;

public class Staticcc {
	static int id;
	static String name;
	int ss;
	static {
		//ss=12;
		id=21;
		System.out.println(id);
	}
	{
		ss=87;
		id=87;
		name="as";
		
		System.out.println(id);
		System.out.println(name);
	}
	public static void main(String[] args) {
		
		
		Staticcc staticcc=new Staticcc();
		
	}

}
