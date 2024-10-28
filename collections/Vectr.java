package collections;

import java.util.Arrays;
import java.util.Vector;

public class Vectr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*legecy class
		 * allows duplicates, null
		 * maintains insertion order
		 * synchronized
		 * default size will be 10
		 * then increases by +10
		 * good for retrieval using index
		 * thread safe
		 */
		Vector<Integer> v = new Vector<>();
		//Add elements
		for (int i = 1; i <= 10; i++)
            v.add(i);
 
        // Printing elements
        System.out.println(v);
        
        //similar to add
        v.insertElementAt(9, 5);
        v.insertElementAt(8, 3);
        System.out.println(v);
        System.out.println(v.capacity());
        
        for(int i:v) {
			System.out.print(i+" ");
		}
        System.out.println();
        
        //Retrieve element
        System.out.println("element at 0 is: "+v.elementAt(0));
        System.out.println("element at 2 is: "+v.get(2));
        
		//delete element
        v.remove(4);
        System.out.println(v);
        
        //Update element
        v.set(6, 21);
        
        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.capacity());
        
        Vector<Integer> v1 = new Vector<Integer>();
        v1.add(11);
        v1.add(12);
        
        System.out.println(v1);
        
        v.addAll(v1);
        
        System.out.println(v);
        
        //search or verify elements
        System.out.println(v.contains(4));
        
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
        
        Object[] arr = v.toArray();
        System.out.println(Arrays.toString(arr));
        System.out.println();
	}

}
