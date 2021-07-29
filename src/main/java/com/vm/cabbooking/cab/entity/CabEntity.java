package com.vm.cabbooking.cab.entity;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.data.annotation.Id;

import com.vm.cabbooking.driver.entity.DriverEntity;

@Entity
public class CabEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7145963424391690880L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;

	private String model;

	private String make;

	private String regNumber;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "driver", referencedColumnName = "id")
	private DriverEntity driver;

	public CabEntity(UUID id, String model, String make, String regNumber) {
		super();
		this.id = id;
		this.model = model;
		this.make = make;
		this.regNumber = regNumber;
	}

	public CabEntity() {

	}

	public CabEntity(UUID id, String model, String make, String regNumber, DriverEntity driver) {
		super();
		this.id = id;
		this.model = model;
		this.make = make;
		this.regNumber = regNumber;
		this.driver = driver;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}

	public DriverEntity getDriver() {
		return driver;
	}

	public void setDriver(DriverEntity driver) {
		this.driver = driver;
	}
}
