package java8.functionalInterface;

import java.util.function.Supplier;

public class SuplierEx {

	public static void main(String[] args) {


		Supplier<Double> randomValue = () -> Math.random();
		
		System.out.println(randomValue.get());
		
	}

}
