package my_pract_nested_class;

public class Nari {
	public class Na{
		int a=8;
		public void ma() {
			System.out.println("jj :"+a);
		}
	}
	
	public static void main(String[] args) {
		//System.out.println(new Na().a);
		Nari.Na na=new Nari().new Na();
		na.ma();
		System.out.println("naa");
	}

}
