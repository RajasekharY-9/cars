package com.infy.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InvoiceStatusController {
	@GetMapping("/invoicestatus")
	public  String goCountry() {
		return "invoicestatus";
	}

}
