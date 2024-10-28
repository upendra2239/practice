package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ColSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> hs = new HashSet<>();
		
		hs.add(12);
		hs.add(3);
		hs.add(5);
		hs.add(6);
		hs.add(9);
		
		System.out.println(hs);
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		
		lhs.add(4);
		lhs.add(8);
		lhs.add(5);
		lhs.add(13);
		lhs.add(10);
		
		System.out.println(lhs);
		
		TreeSet<Integer> ts = new TreeSet<>();
		
		ts.add(4);
		ts.add(9);
		ts.add(3);
		
		System.out.println(ts);
	}

}
