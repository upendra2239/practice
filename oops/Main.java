package oops;

public class Main {

	public static void main(String[] args) {

		// If a Parent type reference refers
        // to a Parent object, then Parent's
        // print is called
		Parent p = new Parent();
		p.print();
		
		// If a Parent type reference refers
        // to a Child object Child's show()
        // is called. 
		// This is called RUN TIME POLYMORPHISM.
		Parent p1 = new Child();
		p1.print();
		
	}
	
}

class Parent{
	public Parent() {
		System.out.println("parent constructor");
	}
	
	public void print() {
		System.out.println("Parent method");
	}
}
class Child extends Parent{
	
	public Child() {
		System.out.println("child constructor");
	}
	
	public void print() {
		System.out.println("Child method");
	}
}