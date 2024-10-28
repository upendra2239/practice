package java8.LambdaExp;

public class Calc {

	interface Calculable{
		int calculate(int a, int b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculable add = (x,y)-> x+y;
		Calculable sub = (x,y)-> x - y;
				
		System.out.println(add.calculate(6, 5));
		System.out.println(sub.calculate(6, 5));

	}

}
