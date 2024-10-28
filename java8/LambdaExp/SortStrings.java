package java8.LambdaExp;

import java.util.ArrayList;


public class SortStrings {

	public static void main(String[] args) {
		
		ArrayList<String> str = new ArrayList<String>();
		
		str.add("Luffy");
		str.add("Zoro");
		str.add("Chopper");
		str.add("Robin");
		str.add("Jinbe");
		
		System.out.println(str);

		str.sort((s1,s2)->s1.compareTo(s2));
			
		System.out.println(str);
	}
	
	
	
}
