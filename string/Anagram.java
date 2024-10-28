package string;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {

		//Anagrams - contains same characters
		Scanner sc = new Scanner(System.in);
		System.out.println("String 1:");
		String s1 = sc.nextLine();
		s1 = s1.toLowerCase();
		
		System.out.println("String 2:");
		String s2 = sc.nextLine();
		s2 = s2.toLowerCase();

		
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);

		
		
		boolean result = Arrays.equals(ch1, ch2);
		if (result) {
			System.out.println("Anagrams");
		}
		else {
			System.out.println("Not Anagrams");
		}
	}

}
