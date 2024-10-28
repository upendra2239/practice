package java8.Streams;

import java.util.Arrays;
import java.util.List;

public class SumAllEven {

	public static void main(String[] args) {

		List<Integer> lst = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		int sum = lst.stream().filter(a->a%2==0).reduce(0,(a,b)->a+b);
		
		System.out.println(sum);
	}

}
