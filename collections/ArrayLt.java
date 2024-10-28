package collections;
import java.util.*;

public class ArrayLt {

	/*
	 * allows duplicates, null
	 * maintains insertion order
	 * not thread safe
	 * can be made synchronize using synchronizedList()
	 * size will be zero until an element is added to it
	 * then increases by +5 (Lower memory overhead)
	 * this is more preferred than vector 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=1;i<=5;i++) {
			al.add(i);
		}
		//print all elements
		System.out.println(al);
		
		al.remove(2);
		
		System.out.println(al);
		
		//print using for each
		for(int j: al) {
			System.out.print(j+" ");
		}
		
		System.out.println();
		//print using iterate
		Iterator it = al.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();

		al.remove(2);
		
		//sort
		al.add(15);
		al.add(8);
		al.add(6);
		Collections.sort(al);
		
		//print using tostring
		System.out.println(al.toString());
	}

}
