package java8.functionalInterface;

import java.util.function.Predicate;

public class PredicateChaining {

	public static void main(String[] args) {


		Predicate<Integer> greatThan = i->i>10;
		
		Predicate<Integer> lessThan = i->i<20;
		
		boolean result = greatThan.and(lessThan).test(15);
		
		System.out.println(result);
		
		boolean result2 = greatThan.and(lessThan).negate().test(15);
		
		System.out.println(result2);
		
		boolean result3 = greatThan.or(lessThan).negate().test(15);
		
		System.out.println(result3);
		
	}

}
