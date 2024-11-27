package thread;

import java.util.LinkedList;
public class ProducerConsumer {

	private LinkedList<Integer> buffer = new LinkedList<>();
	private int capacity = 5;
	
	public void produce() throws InterruptedException{
		int value = 0;
		
		while(true) {
			synchronized (this) {
				while(buffer.size()==capacity) {
					wait();
				}
				
				System.out.println("Producer produced: "+value);
				buffer.add(value++);
				
				notify();
				Thread.sleep(1000);
			}
		}
	}
	
	public void consume() throws InterruptedException{
		
		while(true) {
			synchronized (this) {
				while(buffer.size()==0) {
					wait();
				}
				int consumedValue = buffer.removeFirst();
				System.out.println("Consumer consumed: "+ consumedValue);
				
				notify();
				Thread.sleep(1000);
			}
		}
	}
	
	public static void main(String[] args) {

		ProducerConsumer pc = new ProducerConsumer();
		
		Thread pThread = new Thread(()->{
			try {
				pc.produce();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		Thread cThread = new Thread(()->{
			try {
				pc.consume();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		pThread.start();
		cThread.start();
		
	}

}
