package java8.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class Reduce {

	public static void main(String[] args) {

		List<String> str = new ArrayList<>(Arrays.asList("apple","ball","cat","dog"));
		
		String s = str.stream().reduce("",(a,b)->a+b);
		
		String s1 = str.stream().reduce(new StringJoiner(""), StringJoiner::add,StringJoiner::merge).toString();
		
		System.out.println(s);
		
		System.out.println(s1);
	}

}
