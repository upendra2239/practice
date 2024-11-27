package thread;

import java.util.ArrayList;
import java.util.LinkedList;

public class ProducerConsumer1 extends Thread{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProducerConsumer1 pc1 = new ProducerConsumer1();
		
		Thread pThread = new Thread( () ->{
				
				try {
					pc1.produce();
				}catch(InterruptedException e) {
					e.printStackTrace();
				}});
		
		Thread cThread = new Thread( () ->{
			
			try {
				pc1.consumer();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}});
		pThread.start();
		cThread.start();
		
	}
	
	LinkedList<Integer> buffer = new LinkedList<>();
	private int capacity = 5;
	
	
	public void produce() throws InterruptedException{
		int value=0;
		while(true) {
			synchronized(this) {
				while(buffer.size() == capacity) {
					wait();
				}
				System.out.println("resource "+value+" produced");
				buffer.add(value++);
				
				notify();
				Thread.sleep(1000);
			}
		}
	}
	
	public void consumer() throws InterruptedException{
		while(true) {
			synchronized (this) {
				while(buffer.size() == 0) {
					wait();
				}
				int consumedValue = buffer.removeFirst();
				System.out.println("resource "+consumedValue+" consumed");
				
				notify();
				Thread.sleep(1000);
				
			}
		}
	}

}
