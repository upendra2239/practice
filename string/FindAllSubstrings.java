package string;

import java.util.ArrayList;

public class FindAllSubstrings {

	public static void main(String[] args) {

		String str = "helloworld";
		
		ArrayList<String> substrs = new ArrayList<>();
		
		for(int i =0;i<str.length();i++) {
			String substring = "";
			for(int j=i+1;j<=str.length();j++) {
				substring = str.substring(i, j);
				substrs.add(substring);
			}
		}
		System.out.println(substrs.size());
		System.out.println(substrs);
	}

}
