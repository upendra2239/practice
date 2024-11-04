package java8.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class IntermediateMethods {

	public static void main(String[] args) {

	      List<Integer> intList = Arrays.asList(15,20,48,63,49,27,56,32,9,15,20,56);
	      
	      System.out.println("filter");
	      //filter
	      intList.stream().filter(n->n%2==0).forEach(System.out::println);
	      System.out.println("sorted");

	      //sorted
	      intList.stream().sorted().forEach(System.out::println);
	      System.out.println("reverse sorted");

	      intList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

	      System.out.println("distinct");
	      //distinct
	      intList.stream().distinct().forEach(System.out::println);
	      System.out.println("map");

	      //map
	      intList.stream().map(x->x*2).forEach(System.out::println);
	      
	      System.out.println("All in one");
	      intList.stream().distinct().sorted()
	      .map(x->x*2).filter(n->n%2==0).forEach(System.out::println);

	      
	}

}
