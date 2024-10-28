package string;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CharOccur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Get the future you want";
		char ch = 'e'; 
		int i,count = 0;
		for( i=0;i<s.length();i++) {
			if(s.charAt(i)==ch) {
				count++;
			}
		}
		
		System.out.println("e occured for "+count+" times.");
		
		//count occurrence of each character
		int n = s.length();
		int countEach[] = new int[256];
		for(i=0;i<n;i++) {
			countEach[(int)s.charAt(i)]++;
			
		}
		
		for(i=0;i<256;i++) {
			if(countEach[i]!=0) {
				System.out.println((char)i+"-"+countEach[i]);
			}
		}

	
		System.out.println();
		
		String str1 = "Get the future you want";

		char[] chars = str1.toCharArray();

		Map<Character, Integer> charsCount = new HashMap<>();

		for (char c : chars) {
			if (charsCount.containsKey(c)) {
				charsCount.put(c, charsCount.get(c) + 1);
			} else
				charsCount.put(c, 1);
		}

		System.out.println(charsCount);
		
		System.out.println("each");

		//count occurrence of each character using stream
		System.out.println(
				s.chars()
				.mapToObj(x->(char)x)
				.collect(Collectors.groupingBy(y->y,Collectors.counting()))
				);
		
	}

}
