package java8.Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Even1to100 {

	public static void main(String[] args) {
		
		List<Integer> lst= IntStream.rangeClosed(1, 100).boxed().filter(a->a%2==0).collect(Collectors.toList());
		
		System.out.println(lst);
	}

}
