package my_pract_multlithread;

public class MovieMain {
	public static void main(String[] args) {
		SynchronizedPrabhas synchronizedPrabhas=new SynchronizedPrabhas();
		Movie movie=new Movie(synchronizedPrabhas, "sahoo");
		
		Movie movie1=new Movie(synchronizedPrabhas, "rebel");
		movie1.start();
		movie.start();
		
	}

}
