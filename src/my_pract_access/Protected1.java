package my_pract_access;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import my_pract_basic.Pro;

public class Protected1 {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Protected protected1=new Protected();
		protected1.name();
		System.out.println(protected1.id);
		
		
		
		Method method=Protected.class.getDeclaredMethod("m");
		method.setAccessible(true);

		method.invoke(protected1);
		Pro pro=new Pro();
		System.out.println(pro.id);
	}

}
