package com.example.SpringCrud.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringCrud.Entity.CustomerDetails;
import com.example.SpringCrud.Repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepository customerRepository;

	
	public List<CustomerDetails> saveCustomerDetails(List<CustomerDetails> customerDetails) {
		// TODO Auto-generated method stub
		return customerRepository.saveAll(customerDetails);
	}

	
	public List<CustomerDetails> getCustomerDetails() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	
	public CustomerDetails updateCustomerDetails(CustomerDetails customerDetails) {
		// TODO Auto-generated method stub
		CustomerDetails existingCustomerDetails = customerRepository.findById(customerDetails.getCustomerId()).orElse(customerDetails);
		return existingCustomerDetails;
	}

	
	public String deleteCustomerDetails(long id) {
		// TODO Auto-generated method stub
		customerRepository.deleteById(id);
		return "Customer details with id:"+id+" removed!!";
	}

	

}
