package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorObjs implements Comparator<ComparatorObjs>{

	private int id;
	private String name;
	private int age;
	
	
	public ComparatorObjs(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ComparatorObjs> a = new ArrayList<>();
		
		a.add(new ComparatorObjs(1, "raj", 35));
		a.add(new ComparatorObjs(2, "jai", 27));
		a.add(new ComparatorObjs(3, "sam", 32));
		
		Collections.sort(a, new NameComparator());
		
		for(ComparatorObjs co : a) {
			System.out.println(co.id+" "+co.name+" "+co.age);
		}
		
		System.out.println();
		
		Collections.sort(a,new AgeComparator());
		
		for(ComparatorObjs co : a) {
			System.out.println(co.id+" "+co.name+" "+co.age);
		}
		
	}

	@Override
	public int compare(ComparatorObjs o1, ComparatorObjs o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
