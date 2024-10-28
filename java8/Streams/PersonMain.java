package java8.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> persons = new ArrayList<>();
		
		persons.add(new Person("ram",28));
		persons.add(new Person("raj",30));
		persons.add(new Person("sneha",27));

		Person person = persons.stream().sorted(Comparator.comparing(Person::getAge).reversed())
				.skip(1).findFirst().orElse(null);
		System.out.println(person.getName()+ " "+ person.getAge());
		
	}

}
