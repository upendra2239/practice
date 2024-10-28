package java8;

import java.util.ArrayList;
import java.util.Collections;

public class CompareObjs implements Comparable<CompareObjs>{

	
	private int id;
	private String name;
	private int age;
	
	
	public CompareObjs(int id, String name, int age) {
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
		
		ArrayList<CompareObjs> a = new ArrayList<>();
		
		a.add(new CompareObjs(1, "raj", 35));
		a.add(new CompareObjs(2, "jai", 27));
		a.add(new CompareObjs(3, "sam", 32));
		
		Collections.sort(a);
		
		for(CompareObjs co : a) {
			System.out.println(co.id+" "+co.name+" "+co.age);
		}
		
	}

	@Override
	public int compareTo(CompareObjs obj) {
		// TODO Auto-generated method stub
		
		return (this.age - obj.age);
	}


	
}
