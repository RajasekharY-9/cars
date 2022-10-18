package com.infy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.model.VehicleMake;
@Repository
public interface VehicleMakeRepository  extends JpaRepository<VehicleMake, Integer>{

}
