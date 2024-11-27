package basic;

//Static variables belong to the class itself, not instances of the class.
//Class name is required for access when there is no inheritance relationship.
//Instance of the class does not matter; even with an instance of ClassA, accessing a static variable should ideally be done via the class name for readability and clarity.
public class StaticClassTest extends StaticClass{

	static void message() {
		System.out.println("Hello World");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(n);
		
		//with whichever reference u call the message() of child will be hidden
		StaticClass sc = new StaticClass();
		sc.message();
		
		StaticClassTest.message();
		
		StaticClass.message();
		

		
		
	}

}
