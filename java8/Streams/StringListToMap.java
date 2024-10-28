package java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//convert string list to a map where key is string and value is its length
public class StringListToMap {

	public static void main(String[] args) {

		List<String> strList = Arrays.asList("Apple","Ball","Cat");
		
		Map<String, Integer> strMap = strList.stream()
				.collect(Collectors.toMap(s->s,String::length));
		
		strMap.forEach((word, length)->System.out.println(word+" - "+length));
		
	}

}
