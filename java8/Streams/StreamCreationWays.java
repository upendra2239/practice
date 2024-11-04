package java8.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreationWays {

	public static void main(String[] args) {

		ArrayList<String> gfgNames = new ArrayList<>();
		 
        gfgNames.add("Dean");
        gfgNames.add("castee");
        gfgNames.add("robert");
        
        //1.Using an object as a data source
        // using arrayList and object as data source
       Stream<String> streamNames = gfgNames.stream();
       streamNames.forEach(System.out::println);
       
       //Use collection.stream() to get a stream of the elements
       List<String> strList = Arrays.asList("A","B","C");
       strList.stream().forEach(System.out::println);
       
       
       //Map - stream over their entries, keys, or values.
       Map<Integer, String> map = new HashMap<Integer, String>();
       
       map.put(1, "one");
       map.put(2, "two");
       map.put(3, "three");

       // Stream over map entries
       map.entrySet().stream().forEach(System.out::println);

       // Stream over map keys
       map.keySet().stream().forEach(System.out::println);

       // Stream over map values
       map.values().stream().forEach(System.out::println);
       
       IntStream intStream = IntStream.range(1, 100);
       long max = intStream.filter(n -> n%4==0).count();
       System.out.println(max);
       
    // Integer array
       Integer[] array = {1, 2, 3, 4, 5};
       
       // Convert array to stream
       Stream<Integer> stream = Arrays.stream(array);
       
       // Or alternatively using Stream.of()
       Stream<Integer> stream2 = Stream.of(array);
       
       // Example of using the stream
       stream.forEach(System.out::println);
       
       
	}

}
