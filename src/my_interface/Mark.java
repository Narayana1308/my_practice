package my_interface;

public class Mark implements Cloneable {
	public static void main(String[] args) throws CloneNotSupportedException {
		Mark mark=new Mark();
		 Mark mark2=(Mark) mark.clone();
		 System.out.println(mark);
		 System.out.println(mark2);
	}

}
