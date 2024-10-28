package java8.functionalInterface;

import java.util.function.Predicate;

public class PredicateInFunction {

	static void pred(int  n,Predicate<Integer> predicate) {
		if(predicate.test(n)) {
			System.out.println(n);
		}
	}
	
	public static void main(String[] args) {

		pred(10,i->i>7);
	}

}
