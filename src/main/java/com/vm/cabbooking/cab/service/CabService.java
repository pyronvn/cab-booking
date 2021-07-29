package com.vm.cabbooking.cab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vm.cabbooking.cab.controller.BookCab;
import com.vm.cabbooking.driver.dto.DriverDto;
import com.vm.cabbooking.driver.entity.DriverEntity;
import com.vm.cabbooking.driver.repository.DriverRepository;

@Service
public class CabService {

	@Autowired
	private DriverRepository repo;

	public DriverDto bookCab(BookCab details) throws Exception {
		List<DriverEntity> findAll = repo.findAll();

		for (DriverEntity entity : findAll) {
			if (entity.isAvailable()) {

				return entityToDto(entity);
			}
		}
		throw new Exception("No drivers available");

	}

	private DriverDto entityToDto(DriverEntity entity) {

		if (entity != null) {
			DriverDto dto = new DriverDto();
			dto.setCarRegNumber(entity.getCab().getRegNumber());
			dto.setName(entity.getDriverName());
			dto.setCarModel(entity.getCab().getModel());

			return dto;
		}

		return null;

	}
}
