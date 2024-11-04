package com.example.SpringCrud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.SpringCrud.Entity.CustomerDetails;
import com.example.SpringCrud.Service.CustomerService;

@Controller
public class CustomerDetailsController {

	@Autowired
	CustomerService customerService;
	
	@PostMapping("/saveAllDetails")
	public List<CustomerDetails> saveAllDetails(@RequestBody List<CustomerDetails> customerDetails){
		return customerService.saveCustomerDetails(customerDetails);
	}
	
	@GetMapping("/customerDetails")
	public List<CustomerDetails> customerDetails(){
		return customerService.getCustomerDetails();
	}
	
	
	@PutMapping("/updateDetails")
	public CustomerDetails updateDetails(@RequestBody CustomerDetails customerDetails) {
		return customerService.updateCustomerDetails(customerDetails);
	}
	
	@DeleteMapping("/deleteDetails/{id}")
	public String deleteDetails(@PathVariable long id) {
		return customerService.deleteCustomerDetails(id);
	}
}
