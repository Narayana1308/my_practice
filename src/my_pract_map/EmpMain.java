package my_pract_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EmpMain {
	public static void main(String[] args) {
		HashMap<Integer,Emp> map=new HashMap<>();
		map.put(101, new Emp(101, "narii", 10));
		map.put(102, new Emp(101, "narii", 10));
		map.put(103, new Emp(101, "narii", 13));
		map.put(104, new Emp(101, "narii", 12));

		
		Set<Map.Entry<Integer, Emp>> set=map.entrySet()	;
		Iterator<Map.Entry<Integer, Emp>> iterator=set.iterator();
		System.out.println(map);
		while(iterator.hasNext()) {
			Map.Entry<Integer, Emp> entry= (Entry<Integer, Emp>) iterator.next();
			if(entry.getValue().getSal()==10) {
				entry.setValue(new Emp(entry.getValue().getId(), entry.getValue().getName(), 12000));
			}	
		}
		
		System.out.println(map);
		
		
		
		
	}

}
