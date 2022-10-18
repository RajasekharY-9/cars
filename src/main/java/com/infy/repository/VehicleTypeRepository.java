package com.infy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.model.VehicleType;
@Repository
public interface VehicleTypeRepository  extends JpaRepository<VehicleType, Integer>{

}
