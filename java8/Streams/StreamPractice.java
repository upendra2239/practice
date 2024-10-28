package java8.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {

	public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> numList1 = Arrays.asList(11,2,34,4,57,6,72,8,49,10);

        List<String> strList = Arrays.asList("Apple","Bat","Jeep","Car","1loop","4fatastic");

        String str = "I am Upendra Reddy";
        
        //max 3 numbers
        numList.stream().sorted().limit(3).forEach(System.out::println);
        
        //min 3 numbers
        numList.stream().sorted(Comparator.reverseOrder()).limit(3)
        .forEach(System.out::println);
        
        //max number
        numList.stream().max(Comparator.naturalOrder()).get();
        
        //min number
        numList.stream().min(Comparator.naturalOrder()).get();
        
        //sort list of strings in increasing order of their length
        strList.stream().sorted(Comparator.comparing(String::length))
        .forEach(System.out::println);
        
        //Char freq
        Map<Character,Long> charFreq = str.chars().mapToObj(c -> (char)c)
        		.collect(Collectors.groupingBy(c -> c,Collectors.counting()));
        //second non repeating char
        char ch = str.chars().mapToObj(c -> (char)c).filter(c -> charFreq.get(c) == 1)
        		.skip(1).findFirst().orElse(null);
        System.out.println(ch);
        
        //second largest num
        int secondMax = numList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondMax);
        
        //sum of all digits in a number
        int num =1234;
        int sum = Stream.of(String.valueOf(num).split(""))
        		.collect(Collectors.summingInt(Integer::parseInt));
        System.out.println("Sum of num "+sum);
        
        
        //Common numbers in two lists
        List<Integer> commonNums = numList.stream().filter(numList1::contains)
        		.collect(Collectors.toList());
        System.out.println(commonNums);
        
        
        
        strList.stream().filter(s -> Character.isDigit(s.charAt(0)))
        .forEach(System.out::println);
        
        int arr[]= {12,19,20,88,00,9};
        
        int max = Arrays.stream(arr).max().orElse(0);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
