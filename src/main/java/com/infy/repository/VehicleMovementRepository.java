package com.infy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.model.VehicleMovement;
@Repository
public interface VehicleMovementRepository  extends JpaRepository<VehicleMovement, Integer>{

}
