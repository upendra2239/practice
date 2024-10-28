package java8.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


//Find the longest string in a list of strings

public class LongestStringInList {

	public static void main(String[] args) {

		List<String> strList = new ArrayList<String>();
		
		strList = Arrays.asList("apple", "banana", "cherry", "date", "grapefruit");
	
		Optional<String> longestString = strList.stream().max(Comparator.comparingInt(String::length));
		
		System.out.println(longestString);
	}

}
