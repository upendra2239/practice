package java8.functionalInterface;

import java.util.function.Function;

public class FunctionMethods {

	public static void main(String[] args) {


		Function<Integer, Double> half = a->a/2.0;
		
		//andThen
		System.out.println(half.andThen(a->3*a).apply(10));
		
		//compose
		half = half.compose(a->4*a);
		System.out.println(half.apply(10));
		
		//identity
		Function<Integer, Integer> i = Function.identity();
		
		System.out.println(i.apply(10));
	}

}
