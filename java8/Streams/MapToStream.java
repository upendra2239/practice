package java8.Streams;

import java.util.HashMap;
import java.util.Map;

public class MapToStream {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "hi");
		map.put(2, "Jarvis");
		System.out.println(map);
		//stream of map - key and value
		map.entrySet().stream().forEach(System.out::println);
		
		//stream of map - key
		map.keySet().stream().forEach(System.out::println);
		
		//stream of map - value
		map.values().stream().forEach(System.out::println);
		
	}

}
