package string;

import java.util.stream.Collectors;

public class RemDuplicateChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World";
		
		String withoutDuplicates = str.chars().distinct()
				.mapToObj(ch -> String.valueOf((char) ch))
				.collect(Collectors.joining());
		System.out.println(withoutDuplicates);
		
				
	}

}
