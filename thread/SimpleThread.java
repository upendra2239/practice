package thread;

public class SimpleThread extends Thread{

	public void run() {
		System.out.println("Thread Started Running...");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleThread st = new SimpleThread();
		
		st.start();
		
		
	}

}
