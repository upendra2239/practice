package string;

import java.util.ArrayList;

public class CheckSubstring {

	public static void main(String[] args) {
		 	String str = "hello world";
	        String substring = "world";
	        boolean flag = false;

	        // Loop through the main string
	        for (int i = 0; i <= str.length() - substring.length(); i++) {
	            int j;
	            // Check if substring matches
	            for (j = 0; j < substring.length(); j++) {
	                if (str.charAt(i + j) != substring.charAt(j)) {
	                    break;
	                }
	            }
	            // If we completed the inner loop, it means we found the substring
	            if (j == substring.length()) {
	                flag = true;
	                break;
	            }
	        }

	        if (flag) {
	            System.out.println("substring exists");
	        } else {
	            System.out.println("substring does not exist");
	        }
	}
}
