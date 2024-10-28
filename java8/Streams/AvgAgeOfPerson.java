package java8.Streams;

import java.util.Arrays;
import java.util.List;

//Calculate the average age of a list of Person objects

public class AvgAgeOfPerson {

	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(
			    new Person("Alice", 25),
			    new Person("Bob", 30),
			    new Person("Charlie", 35)
			);
		double avgAge = persons.stream().mapToInt(Person::getAge)
				.average().orElse(0.0);
		
		System.out.println(avgAge);
	}

}
