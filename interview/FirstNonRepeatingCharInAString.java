package interview;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharInAString {

	public static void main(String[] args) {
		
		String input = "ppppppiiiiyyyyttwuwww";
		
		
		Map<Character, Long> frequencyMap = input.chars().mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		char firstNonRepeatingChar = input.chars().mapToObj(c ->(char)c)
				.filter(c -> frequencyMap.get(c) == 1)
				.findFirst().orElse(null);
		
		System.out.println(firstNonRepeatingChar);
	}	
}
