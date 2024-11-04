package java8.Streams;

import java.util.Arrays;
import java.util.List;

public class SliceStream {

	public static void main(String[] args) {

	      List<Integer> intList = Arrays.asList(15,20,48,63,49,27,56,32,9,15,20,56);
	      
	      intList.stream().skip(3).limit(9).forEach(System.out::println);
	      
	}

}
