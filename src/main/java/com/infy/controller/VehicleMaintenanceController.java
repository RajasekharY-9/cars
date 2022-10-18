package com.infy.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleMaintenanceController {
	@GetMapping("/VehicleMaintenance")
	public  String goCountry() {
		return "VehicleMaintenance";
	}
}
