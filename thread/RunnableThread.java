package thread;

public class RunnableThread implements Runnable{

	public static void main(String[] args) {

		RunnableThread rt = new RunnableThread();
		
		Thread t1 =new Thread(rt);
		t1.start();
		
		//thread using lambda expression
		Runnable th = ()->{System.out.println("thread is running..");};
				
		Thread t = new Thread(th);
		t.start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread Started Running...");
	}

}
