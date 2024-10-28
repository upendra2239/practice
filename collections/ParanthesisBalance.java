package collections;

import java.util.EmptyStackException;
import java.util.Stack;

public class ParanthesisBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "{((a+b){{{})}";
		
		Stack<Character> st = new Stack<Character>();
		
		for(int i=0;i<s1.length();i++) {

			try {
				switch (s1.charAt(i)) {
				case '{':
				case '(':
				case '[':
					st.push(s1.charAt(i));
					break;
				
				case '}':
					if(st.peek() == '{') {
						st.pop();
					}
					break;
				case ']':
					if(st.peek() == '[') {
						st.pop();
					}
					break;
				
				case ')':
					if(st.peek() == '(') {
						st.pop();
					}
					break;
					
				default:
					break;
				}
			} catch (EmptyStackException e) {
				System.out.println("Expression is not balanced");
				return;
			}
			
		}
		if(st.isEmpty()) {
		System.out.println("Expression is balanced");
		}
		else {
			System.out.println("Expression is not balanced");

		}
		
		
	}

}
