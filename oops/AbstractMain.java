package oops;


abstract class MyClass{
	//can have instance variables
	int a = 6;
	
	public MyClass() {
		System.out.println("Abstract class constructor");
	}
	//can have concrete methods or only concrete methods
	 int add(int a, int b) {
		 return a+b;
	 }
	
	double divide(int a, int b) {
		return a/b;
	}
	
}

public class AbstractMain extends MyClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractMain am = new AbstractMain();
		System.out.println(am.add(3, 5));
		System.out.println(am.divide(10, 5));

	}

	

}
