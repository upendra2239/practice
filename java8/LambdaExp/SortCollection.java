package java8.LambdaExp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class SortCollection {

	int id;
	String s;
	
	
	public SortCollection(int id, String s) {
		super();
		this.id = id;
		this.s = s;
	}


	public static void main(String[] args) {

		//sorting using arraylist
		ArrayList<Integer> al = new ArrayList<>();
		al.add(8);
		al.add(10);
		al.add(5);
		al.add(9);
		
		System.out.println(al);
		
		Collections.sort(al, (ob1,ob2)-> (ob1>ob2)? 1 :
			(ob1 < ob2)? -1:0);
		System.out.println(al);
		
		//sorting using treeset
		TreeSet<Integer> ts = new TreeSet<>((o1, o2) -> (o1 > o2) ?
                -1 : (o1 < o2) ? 1 : 0);
		ts.add(8);
		ts.add(10);
		ts.add(5);
		ts.add(9);
		System.out.println(ts);
		
		//sorting in descending order
		TreeSet<Integer> ts1 = new TreeSet<>((a,b)->b.compareTo(a));
		ts1.add(1);
		ts1.add(2);
		ts1.add(3);
		ts1.add(4);
		System.out.println(ts1);
		
		//sorting using objects
		
		ArrayList<SortCollection> sc = new ArrayList<>();
		sc.add(new SortCollection(1, "a"));
		sc.add(new SortCollection(34, "z"));
		sc.add(new SortCollection(7, "j"));
		sc.add(new SortCollection(14, "y"));
		sc.add(new SortCollection(5, "e"));
		
		Collections.sort(sc, (obj1,obj2)->{
			return Integer.valueOf(obj1.id).compareTo(Integer.valueOf(obj2.id));
		});
		for(SortCollection s: sc) {
			System.out.println(s.id+" "+s.s);
		}
	}

}
