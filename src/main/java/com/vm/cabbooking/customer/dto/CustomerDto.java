package com.vm.cabbooking.customer.dto;

public class CustomerDto {

	private String customerName;
	private Long mobileNumber;
	private String email;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public CustomerDto(String customerName, Long mobileNumber, String email) {
		super();
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.email = email;
	}

	public CustomerDto() {

	}

}
