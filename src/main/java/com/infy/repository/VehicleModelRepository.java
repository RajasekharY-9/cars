package com.infy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.model.VehicleModel;
@Repository
public interface VehicleModelRepository  extends JpaRepository<VehicleModel, Integer>{

}
