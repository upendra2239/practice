package core;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeExample {

	public static void main(String[] args) {

		Employee employee;
		
		try(FileInputStream fileIn = new FileInputStream("employee.ser");
				ObjectInputStream in = new ObjectInputStream(fileIn)){
			
			employee = (Employee) in.readObject();
			System.out.println(employee.id+" "+employee.name);
			
		}catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
