package com.vm.cabbooking.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vm.cabbooking.customer.dto.CustomerDto;
import com.vm.cabbooking.customer.service.CustomerService;

@RestController(value = "/api/v1/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/add")
	public String addCustomer(@RequestBody CustomerDto dto) throws Exception {
		return customerService.addCustomer(dto);
	}
}
