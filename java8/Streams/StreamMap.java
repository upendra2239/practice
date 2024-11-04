package java8.Streams;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMap {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("A", 10);
		map.put("B", 20);
		map.put("C", 30);
		
		Map<String, Integer> filterMap = map.entrySet().stream()
				.filter(entry -> entry.getValue()>15)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		System.out.println(filterMap);
	}

}
