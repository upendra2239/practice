package java8.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> s = new ArrayList<>();
		s.add("abcdef");
		
		s = s.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println(s);
		
		ArrayList<Integer> marks = new ArrayList<Integer>();
		  
        marks.add(30);
        marks.add(78);
        marks.add(26);
        marks.add(96);
        marks.add(79);
  
        System.out.println("Marks of students before grace : " + marks);
		
        List<Integer> updatedMarks = marks.stream().map(i->i+6).collect(Collectors.toList());
        
        System.out.println("Marks of students after grace:"+updatedMarks);
        
        //flatmap - gives stream of stream values
        List<List<Integer> > number = new ArrayList<>();
        
        number.add(Arrays.asList(1, 2));
        number.add(Arrays.asList(3, 4));
        number.add(Arrays.asList(5, 6));
        number.add(Arrays.asList(7, 8));
       
        System.out.println("List of list-" + number);
        
        List<Integer> flatList = number.stream().flatMap(list->list.stream())
        		.collect(Collectors.toList());
        
        System.out.println("List generate by flatMap-"+ flatList);
	}

}
