package my_practice_Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDeleting {
	public static void main(String[] args) {
		LinkedList<Integer> list=new  LinkedList<>();
		list.add(123);
		list.add(131);
		list.add(224);
		LinkedList< Integer> list2=new LinkedList<>();
		for(Integer i:list)
		{
			int num=i;
			int count=0;
			int i1=0;
			while(num>0)
			{
				int r=num%10;
				i1++;
				if(i1==1)
					count=r;
				else {
					count=count-r;
				}
				num=num/10;
			}
			if(count==0)
				list2.add(i);
		}
		for(Integer i:list2)
		{
			list.remove(i);
		}
		
		System.out.println(list);
	}
}
