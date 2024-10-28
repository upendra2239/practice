package collections;

import java.util.PriorityQueue;

public class PriorityQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
            pq.add(1);
            pq.add(1);
            pq.add(3);
            pq.add(6);
            pq.add(5);
            pq.add(2);
 
        // Printing elements
        System.out.println(pq);
        
        System.out.println(pq.element());
        
        System.out.println(pq.peek());
        
        System.out.println(pq.poll());
        
        
        System.out.println(pq);
	}

}
