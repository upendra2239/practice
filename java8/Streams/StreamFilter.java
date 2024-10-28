package java8.Streams;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.sound.sampled.AudioInputStream;

public class StreamFilter {

	String name;
	int age;
	
	
	
	public StreamFilter(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return "StreamFilter [name=" + name + ", age=" + age + "]";
	}



	public static void main(String[] args) {

		//filter by obj properties
		Stream<Integer> myStream = Stream.of(1,2,3,4,5);
		
		myStream.filter(a->a%2==0).forEach(System.out::println);
		
		//filter by indices 1
		String[] sarr = new String[] {"stream","is",  "a",
                "sequence", "of",  "elements",
                "like", "list"};
		
		System.out.println("");
		Stream<String> myStream1 = Stream.of(sarr);
		
		AtomicInteger i = new AtomicInteger(0);
		
		myStream1.filter(x->i.getAndIncrement()%2==0)
		.forEach(System.out::println);
		
		//filter by indices 2
		String[] sarr1 = new String[] {"stream","is",  "a",
                "sequence", "of",  "elements",
                "like", "list"};

		IntStream.rangeClosed(0,sarr1.length-1)
		.filter(x->x%2==0).mapToObj(x->sarr1[x])
		.forEach(System.out::println);
		
		//filter by custom properties - by age
		List<StreamFilter> myList = Arrays.asList(
	            new StreamFilter("Ram", 25),
	            new StreamFilter("Kumar", 40),
	            new StreamFilter("Rakesh", 35));
		
		myList.stream().filter(x->x.age>=35)
		.forEach(System.out::println);
		
	}

}
