package my_practice_object;

public class GetClasss {
	int a = 9;

	public void m1(java.lang.Object getClasss) throws Exception, IllegalAccessException {
		Class class1 = getClasss.getClass();
		GetClasss classs = (GetClasss) class1.newInstance();
		System.out.println(classs.a);
	}

	public static void main(String[] args) throws Exception {
		GetClasss classs = new GetClasss();
		classs.m1(new  java.lang.Object());
	}

}
