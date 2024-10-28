package java8.LambdaExp;

public class Threads {

	public static void main(String[] args) {


		Runnable myThread = ()->{
			Thread.currentThread().setName("my Thread");
			System.out.println(Thread.currentThread().getName());
		};
		Thread t1 = new Thread(myThread);
		t1.start();
	}

}
