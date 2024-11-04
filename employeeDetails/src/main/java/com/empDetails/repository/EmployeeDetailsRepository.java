package com.empDetails.repository;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.empDetails.entity.EmployeeDetails;

public interface EmployeeDetailsRepository extends JpaRepository<EmployeeDetails,Integer> {
	
List<EmployeeDetails> findAllByName( String firstName, Pageable pageable);
}
