package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedLst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> ll = new LinkedList<>();
		
		for(int i=1;i<=5;i++) {
			ll.add(i);
		}
		
		System.out.println(ll);
		
		for(int i:ll) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		ll.addLast(7);
		
		System.out.println(ll);
		
		ll.removeFirst();
		System.out.println(ll);
		
		//reverse list
		Iterator<Integer> i = ll.descendingIterator();
		
		while(i.hasNext()) {
			System.out.print(i.next()+",");
		}
	}

}
