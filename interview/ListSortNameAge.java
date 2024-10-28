package interview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import java8.Streams.Person;

//get list of persons with name starting with 'A' and sort by age
public class ListSortNameAge {

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Amar", 35));
		persons.add(new Person("Jane", 26));
		persons.add(new Person("Armin", 19));
		
		 List<Person> result =   persons.stream().filter(person -> person.getName().startsWith("A"))
		.sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());

		 result.forEach(person -> System.out.println(person));
	}

}
