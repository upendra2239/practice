package com.example.SpringCrud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringCrud.Entity.CustomerDetails;

public interface CustomerRepository extends JpaRepository<CustomerDetails, Long>{

}
