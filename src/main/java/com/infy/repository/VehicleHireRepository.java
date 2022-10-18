package com.infy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.model.VehicleHire;
@Repository
public interface VehicleHireRepository  extends JpaRepository<VehicleHire, Integer>{

}
