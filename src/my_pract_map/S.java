package my_pract_map;

import java.util.Map;
import java.util.TreeMap;

public class S {
	public static void main(String[] args) {
		Map<Emp, Emp> map=new TreeMap<Emp, Emp>();
		map.put(new Emp(1101, "sds", 12), new Emp(102, "sdsd", 20));
		map.put(new Emp(1011, "sds", 12), new Emp(102, "sdsd", 20));
		map.put(new Emp(1012, "sds", 12), new Emp(102, "sdsd", 20));
		System.out.println(map);
		
		
	}

}
