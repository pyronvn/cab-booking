package com.vm.cabbooking.driver.dto;

public class DriverDto {

	private String name;
	private String idType;
	private String idNumber;

	private String carRegNumber;
	private String carMake;
	private String carModel;

	public DriverDto(String name, String idType, String idNumber, String carRegNumber, String car, String carModel) {
		super();
		this.name = name;
		this.idType = idType;
		this.idNumber = idNumber;
		this.carRegNumber = carRegNumber;
		this.carMake = car;
		this.carModel = carModel;
	}
	
	public DriverDto() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getCarRegNumber() {
		return carRegNumber;
	}

	public void setCarRegNumber(String carRegNumber) {
		this.carRegNumber = carRegNumber;
	}

	public String getCarMake() {
		return carMake;
	}

	public void setCarMake(String car) {
		this.carMake = car;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

}
