package string;

import java.util.stream.IntStream;

public class PalindromeStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "MadaMe";
		boolean isPalindrome = IntStream.range(0, str.length()/2)
				.allMatch(i->str.charAt(i)==str.charAt(str.length()-i-1));

	if(isPalindrome) {

	System.out.println("palindrome");
}
else {
	System.out.println("not palindrome");
}
}
}