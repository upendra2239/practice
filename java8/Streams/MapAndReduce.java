package java8.Streams;

import java.util.ArrayList;
import java.util.List;

public class MapAndReduce {

	private int id;
	private String name;
	private int salary;
	
	
	public static void main(String[] args) {

		List<MapAndReduce> emp = new ArrayList<>();
		emp.add(new MapAndReduce(1,"sai",50000));
		emp.add(new MapAndReduce(2,"jai",40000));
		emp.add(new MapAndReduce(3,"joe",60000));
		
		int salary = emp.stream().map(MapAndReduce::getSalary).reduce(0,(a,b)->a+b);
		
		System.out.println(salary);

	}

	
	public MapAndReduce(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}

}
