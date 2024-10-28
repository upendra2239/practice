package oops;

//Overloading
public class Polympsm {

	public static void main(String[] args) {
		Polympsm p = new Polympsm();
		p.method1(5);
		p.method1(4, 7);
		

	}
	
	public void method1(int a, int b) {
		
		System.out.println(a+b);
	}
	
	public void method1(int a) {
		System.out.println(a);
	}

}
