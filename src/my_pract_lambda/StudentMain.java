package my_pract_lambda;

import java.util.function.Function;

public class StudentMain {
	public static void main(String[] args) {
		Function<Student, Double> function=stu->{return stu.getSal()+100;};
		
		Student [] students= {
				new Student("a", 10, "w"),
				new Student("a", 20, "w"),
				new Student("a", 30, "w"),
				new Student("a", 40, "w"),
		};
		for(Student student:students) {
			
			
			System.out.println(function.apply(student));
		}
		
		
	}

}
