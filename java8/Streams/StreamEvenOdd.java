package java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(1,6,8,3,9,5);
		
		Map<Boolean, List<Integer>>  EvenOrOdd = list.stream()
				.collect(Collectors.partitioningBy(n -> n%2==0));
		
		List<Integer> evenList = EvenOrOdd.get(true);
		List<Integer> oddList = EvenOrOdd.get(false);
		
		System.out.println(evenList);
		System.out.println(oddList);

	}

}
