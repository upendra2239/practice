package string;

import java.util.Arrays;
import java.util.Comparator;

public class LongwordInStringStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "The jumps brown fox quick over the lazy dog";
		String str1 = Arrays.stream(str.split(" "))
				      .max(Comparator.comparingInt(String::length))
				      .orElse(null);
		System.out.println(str1);
				

	}

}
