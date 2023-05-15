package my_pract_basic;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import my_pract_access.Protected;

public class Pro  extends Protected{
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Pro pro=new Pro();
		Protected protected1=new Protected();
		
		
		Method method=Protected.class.getDeclaredMethod("m");
		
		method.setAccessible(true);
		method.invoke(protected1);
		
		
	System.out.println(protected1);
	System.out.println(pro.id);
	pro.name();
	}

}
