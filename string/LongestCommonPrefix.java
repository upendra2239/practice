package string;

import java.util.Scanner;

public class LongestCommonPrefix {

	public static void main(String[] args) {
	
		String[] strs = {"flower", "flow", "flight"};
		
	String prefix = strs.length>0 ? strs[0] : "";
	
	for(int i=1;i<strs.length;i++) {
		//check if current prefix is same as the next element
		while(strs[i].indexOf(prefix)!=0) {
			prefix = prefix.substring(0, prefix.length()-1);
			if(prefix.isEmpty()) break;
			
		}
		if(prefix.isEmpty()) break;

	}
	System.out.println(prefix);
	
	
	
	}
}

