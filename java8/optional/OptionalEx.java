package java8.optional;

import java.util.Optional;

public class OptionalEx {

	public static void main(String[] args) {

		String words[] = new String[10];
		//words[5] = "Apple";
		
		//avoids NullPointerException
		Optional<String> checkNull = Optional.ofNullable(words[5]);
		
		if(checkNull.isPresent()) {
			String word = words[5].toLowerCase();
			System.out.println(word);
		}
		else {
			System.out.println("word is null");
		}
	}

}
