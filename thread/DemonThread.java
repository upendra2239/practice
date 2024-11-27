package thread;

public class DemonThread extends Thread{

	public DemonThread(String name) {
		super(name);
	}
	
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println(getName()+" is Demon th");
			System.out.println(getName()+" priority is "+getPriority());

		}
		else {
			System.out.println(getName()+" is user th");
			System.out.println(getName()+" priority is "+getPriority());
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemonThread t1 = new DemonThread("t1");
		DemonThread t2 = new DemonThread("t2");
		DemonThread t3 = new DemonThread("t3");

		
		//Demon thread gets the priority of the main thread which is 5.
		//we can explicitly set demon thread priority like below
		t1.setDaemon(true);
		t1.setPriority(MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.setDaemon(true);
		t3.setPriority(MIN_PRIORITY);
		t3.start();
		
	}

}
