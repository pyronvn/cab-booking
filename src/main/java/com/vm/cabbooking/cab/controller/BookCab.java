package com.vm.cabbooking.cab.controller;

import com.vm.cabbooking.customer.dto.CustomerDto;

public class BookCab {

	private String destination;
	private CustomerDto customerDto;

	public BookCab(String destination, CustomerDto customerDto) {
		super();
		this.destination = destination;
		this.customerDto = customerDto;
	}

	public BookCab() {

	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public CustomerDto getCustomerDto() {
		return customerDto;
	}

	public void setCustomerDto(CustomerDto customerDto) {
		this.customerDto = customerDto;
	}

}
