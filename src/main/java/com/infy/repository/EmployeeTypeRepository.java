package com.infy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.model.EmployeeType;
@Repository
public interface EmployeeTypeRepository  extends JpaRepository<EmployeeType, Integer>{

}