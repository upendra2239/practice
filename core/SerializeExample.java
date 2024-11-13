package core;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeExample {

	public static void main(String[] args) {

		Employee employee = new Employee(1, "upendra");
		
		try(FileOutputStream fileOut = new FileOutputStream("employee.ser");
				ObjectOutputStream out = new ObjectOutputStream(fileOut)){
			
			out.writeObject(employee);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
				
		
	}

}
