package com.vm.cabbooking.driver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vm.cabbooking.driver.dto.DriverDto;
import com.vm.cabbooking.driver.service.DriverService;

@RestController(value = "/api/v1/driver")
public class DriverController {

	@Autowired
	private DriverService driverService;

	@PostMapping("/add")
	public String addDriver(@RequestBody DriverDto dto) throws Exception {
		return driverService.addDriver(dto);
	}
}
