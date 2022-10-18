package com.infy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.model.Vehicle;
@Repository
public interface VehicleRepository  extends JpaRepository<Vehicle, Integer>{

}
