package collections;

import java.util.Stack;

public class CStack {

	public static void main(String[] args) {

		Stack<Integer> s = new Stack<>();
		
		for (int i = 1; i <= 5; i++)
            s.push(i);
 
        // Printing elements
        System.out.println(s);
        
        System.out.println(s.peek());
        
        System.out.println(s.search(3));
        
        System.out.println(s.pop());
        
        s.push(null);
        
        System.out.println(s);
        
        System.out.println(s.empty());

	}

}
