package java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//Check if a list of integers contains a prime numbers using Java streams
public class PrimesInList {

	public static void main(String[] args) {

	List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
	
	List<Integer> primes = numbers.stream().filter(num -> num > 1 && 
			IntStream.range(2, (int)Math.sqrt(num) + 1)
			.noneMatch(i -> num % i == 0)
			).collect(Collectors.toList());
	
	System.out.println(primes);
	
	}

}
