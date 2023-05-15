package my_pract_serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class DhanMain {
	public static void main(String[] args) throws Exception {
//		Dhanush dhanush=new Dhanush("a",12);
//		
//		FileOutputStream fileOutputStream=new FileOutputStream("C:\\TY/narri.txt",true);
//		ObjectOutputStream outputStream=new ObjectOutputStream(fileOutputStream);
//		outputStream.writeObject(dhanush);
//		
//		FileInputStream fileInputStream=new FileInputStream("C:\\TY/narri.txt");
//		ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
//		Dhanush dhanush2=(Dhanush)objectInputStream.readObject();
//		
//		System.out.println(dhanush2.naemString+" "+dhanush2.id);
		Stack<Integer> stack=new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(1);
		stack.push(3);
		stack.pop();
		for(Integer integer: stack) {
			System.out.print(integer +" ");
		}
		
		System.out.println();
		Enumeration<Integer> enumeration=stack.elements();
		while(enumeration.hasMoreElements()) {
			System.out.print(enumeration.nextElement()+" ");
		}
		PriorityQueue<Integer> queue=new PriorityQueue<>();
		queue.add(1);
		queue.add(232);
		queue.add(7878);
		queue.poll();
		System.out.println();
		Iterator<Integer> iterator =queue.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		
		
	}

}
