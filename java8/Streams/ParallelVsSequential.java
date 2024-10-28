package java8.Streams;

import java.util.Arrays;
import java.util.List;

public class ParallelVsSequential {

	public static void main(String[] args) {

		//sequential stream
		List<String> list = Arrays.asList( "Hello ", 
                "G", "E", "E", "K", "S!");
		list.stream().forEach(System.out::println);
		
		System.out.println();
		//parallel stream
		list.parallelStream().forEachOrdered(System.out::println);
	}

}
