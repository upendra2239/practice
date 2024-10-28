package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class AlphaNumeric {

	public static void main(String[] args) {

		String str ="15dngk367";
				
		ArrayList<Integer> digitList = new ArrayList<>();
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				digitList.add(Integer.valueOf(ch));
			}
	}
		Collections.sort(digitList, Collections.reverseOrder());
		
		System.out.println(digitList);
	}

}
