package basic;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySecondHighest {

	public static void main(String[] args) {

		int array[] = {10,36,78,32,11};
		
		//method 1
		int highest = 0;
		int secondHighest = 0;
		
		for(int n: array) {
			if(n > highest) {
				secondHighest = highest;
				highest = n;
			}else if(n > secondHighest && n < highest) {
				secondHighest = n;
			}
		}
		System.out.println(secondHighest);
		
		//method 2
		Arrays.sort(array);
		
		System.out.println(array[array.length-2]);
		
		//method 3
		int secondHighest2 = Arrays.stream(array).boxed().sorted(Comparator.reverseOrder())
				.skip(1).findFirst().orElse(0);
		
		System.out.println(secondHighest2);

	}

}
