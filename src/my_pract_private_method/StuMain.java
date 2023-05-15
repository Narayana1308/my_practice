package my_pract_private_method;

import java.lang.reflect.Method;

public class StuMain {
	
	public static void main(String[] args) throws Exception {
		
		//Class class1=Class.forName("my_pract_private_method.Student");
		Class class1=Student.class;
		Object object=class1.newInstance();
		
		Method method=class1.getDeclaredMethod("marks", null);
		method.setAccessible(true);
		method.invoke(0, null);
		
		
	}

}
