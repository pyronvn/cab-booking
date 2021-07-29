package com.vm.cabbooking.driver.entity;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;

import org.springframework.data.annotation.Id;

import com.vm.cabbooking.cab.entity.CabEntity;

@Entity
public class DriverEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;

	private String driverName;

	private String idType;

	private String idNumber;

	private boolean available;

	@OneToOne(cascade = CascadeType.ALL)
	private CabEntity cab;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
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

	public CabEntity getCab() {
		return cab;
	}

	public void setCab(CabEntity cab) {
		this.cab = cab;
	}

	public DriverEntity(UUID id, String driverName, String idType, String idNumber, CabEntity cab) {
		super();
		this.id = id;
		this.driverName = driverName;
		this.idType = idType;
		this.idNumber = idNumber;
		this.cab = cab;
	}

	public DriverEntity() {

	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean isAvailable) {
		this.available = isAvailable;
	}
}
