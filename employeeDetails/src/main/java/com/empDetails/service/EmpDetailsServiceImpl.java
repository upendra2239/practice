package com.empDetails.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.empDetails.entity.EmployeeDetails;
import com.empDetails.repository.EmployeeDetailsRepository;

@Service
public class EmpDetailsServiceImpl implements EmpDetailsService {
	@Autowired
	private EmployeeDetailsRepository repository;
	
	//Saves all employee details
	public List<EmployeeDetails> saveEmpsDetails(List<EmployeeDetails> employeeDetails) {
		return repository.saveAll(employeeDetails);
		
	}
		
	//gets all employees details
	public List<EmployeeDetails> readAllEmpDetails() {
		return repository.findAll();
	}
	
	//gets an employee details by id
	public EmployeeDetails readEmpDetailsById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	
	
	//deletes an employee details using id
	public String deleteEmpDetails(int id) {
		repository.deleteById(id);
		return "Employee details with id:"+id+" removed!!";
	}
	firstName;
	private String lastName;
	private String emailId;
	private Date dob;
	private long mobNumber;
	private String address;
	//updates employee details using id
	public EmployeeDetails updateEmpDetails(EmployeeDetails employeeDetails) {
		
		EmployeeDetails existingEmployeeDetails = repository.findById(employeeDetails.getId()).orElse(employeeDetails);
		existingEmployeeDetails.setFirstName(employeeDetails.getFirstName());
		
		return repository.save(existingEmployeeDetails);
}

}
