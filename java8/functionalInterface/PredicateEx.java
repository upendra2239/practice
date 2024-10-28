package java8.functionalInterface;

import java.util.function.Predicate;

public class PredicateEx {

	public static void main(String[] args) {

		Predicate<Integer> lessThan = i->(i<18);
		
		System.out.println(lessThan.test(5));
	}

}
