package java8.Streams;

import java.util.ArrayList;
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
       
       IntStream intStream = IntStream.range(1, 100);
       long max = intStream.filter(n -> n%4==0).count();
       System.out.println(max);
       
       
	}

}
