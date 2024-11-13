package java8.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> persons = new ArrayList<>();
		
		persons.add(new Person("ram",28));
		persons.add(new Person("raj",30));
		persons.add(new Person("sneha",27));
		persons.add(new Person("ramesh",28));
		persons.add(new Person("sunil",30));

		Person person = persons.stream().sorted(Comparator.comparing(Person::getAge).reversed())
				.skip(1).findFirst().orElse(null);
		System.out.println(person.getName()+ " "+ person.getAge());
		
		//Group By Age
		Map<Integer, List<Person>> ageMap = persons.stream().collect(Collectors.groupingBy(Person::getAge));
		ageMap.entrySet().forEach(System.out::println);
	}

}
