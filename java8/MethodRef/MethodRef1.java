package java8.MethodRef;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MethodRef1 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(7);
		list.add(6);
		
		Consumer<Integer> add4 = System.out::println;
		
		list.forEach(add4);
		
		
	}

}
