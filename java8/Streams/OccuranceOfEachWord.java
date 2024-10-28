package java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OccuranceOfEachWord {

	public static void main(String[] args) {

		 List<String> lines = Arrays.asList(
		            "Hello world",
		            "Hello Java",
		            "Java streams are powerful",
		            "World of Java"
		        );
		 
		 Map<String, Long> wordCount = lines.stream()
				 .flatMap(line -> Arrays.stream(line.split(" ")))
				 .map(String::toLowerCase)
				 .collect(Collectors.groupingBy(word-> word, Collectors.counting()));
		 wordCount.forEach((word,count) -> System.out.println(word+" "+count));
	}

}
