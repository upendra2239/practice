package java8.optional;

import java.util.Optional;

public class OptionalMethods {

	public static void main(String[] args) {

		String str[] = new String[5];
		
		str[2] = "sdajnsdjnjs";
		str[3] = "Hello";
		
		Optional<String> empty = Optional.empty();
		System.out.println(empty);
		
		Optional<String> value = Optional.of(str[2]);
		System.out.println(value);
		
		Optional<String> value1 = Optional.ofNullable(str[3]);
		System.out.println(value1);
		
		System.out.println(value1.get());
		
		System.out.println(value.hashCode());
		
		System.out.println(value.isPresent());

	}
}
