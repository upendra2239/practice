package java8.LambdaExp;

public class HelloWorldPrint {

	@FunctionalInterface
	public interface HelloWorld {

		String hello();
	}
	
	public static void main(String[] args) {

		//Printing using Runnable
		Runnable helloW = ()->{System.out.println("Hello World");};
		helloW.run();
		
		//Printing using custom Functional Interface
		HelloWorld helloWorld = () -> {
		 return "Hello World";
		};
		System.out.println(helloWorld.hello());
		
		new Thread(()->{
			System.out.println("Helo world");
		}).start();
	}

	
}
