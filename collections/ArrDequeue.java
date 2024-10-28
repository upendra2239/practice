package collections;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrDequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<Integer> aq = new ArrayDeque<>();
		
		aq.offer(1);
		aq.offer(2);
		aq.offer(3);
		aq.offerFirst(11);
		aq.addLast(45);
		
		System.out.println(aq);
		
		System.out.println(aq.peek());
		
		System.out.println(aq.peekFirst());

		System.out.println(aq.peekLast());

		System.out.println(aq.poll());
		
		System.out.println(aq.pollFirst());

		System.out.println(aq.pollLast());

		System.out.println(aq);

		
		aq.addFirst(12);
		aq.addLast(15);
		
		System.out.println(aq);

		
		LinkedList<Integer> q = new LinkedList<>();
		
		q.add(10);
		q.add(20);
		q.add(15);
		q.addFirst(4);
		q.addLast(7);
		
		System.out.println(q);
		
		System.out.println(q.peek());
		
		System.out.println(q.peekFirst());

		System.out.println(q.peekLast());

		System.out.println(q.poll());
		
		System.out.println(q.pollFirst());

		System.out.println(q.pollLast());

		System.out.println(q);
		
		//Priority Queue
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		pq.offer(11);
		pq.offer(2);
		pq.offer(8);
		pq.offer(17);
		pq.offer(4);
		
		System.out.println(pq);
		
		System.out.println(pq.peek());

		System.out.println(pq.poll());
		
		pq.remove(2);
		
		System.out.println(pq);

		

	}

}
