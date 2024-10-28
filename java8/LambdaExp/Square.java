package java8.LambdaExp;

public class Square {

	public interface Squarable {
		int sq(int n);
	}
	
	public static void main(String[] args) {
		
		Squarable sqr = (n)->{
			return n*n;
	};
	
	System.out.println(sqr.sq(5));
	}

}
