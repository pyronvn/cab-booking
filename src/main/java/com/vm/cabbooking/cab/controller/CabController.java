package com.vm.cabbooking.cab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vm.cabbooking.cab.service.CabService;
import com.vm.cabbooking.driver.dto.DriverDto;

@RestController(value = "/api/v1/book")
public class CabController {

	@Autowired
	private CabService cabService;

	@PostMapping("/book")
	public DriverDto bookCab(@RequestBody BookCab bookinDetails) throws Exception {

		DriverDto bookCab = cabService.bookCab(bookinDetails);

		return bookCab;
	}
}
