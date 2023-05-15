package my_pract_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseByStream {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("zSus","Abhi");
		List<String> strings=list.stream().sorted(String::compareToIgnoreCase).collect(Collectors.toList());
				System.out.println(strings);
	}

}
