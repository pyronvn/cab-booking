package com.vm.cabbooking.driver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vm.cabbooking.cab.entity.CabEntity;
import com.vm.cabbooking.driver.dto.DriverDto;
import com.vm.cabbooking.driver.entity.DriverEntity;
import com.vm.cabbooking.driver.repository.DriverRepository;

@Service
public class DriverService {

	@Autowired
	private DriverRepository driverRepo;

	public String addDriver(DriverDto dto) throws Exception {

		DriverEntity dtoToEntity = dtoToEntity(dto);

		if (dtoToEntity != null) {
			driverRepo.save(dtoToEntity);
			return "Driver Added successfully!";
		} else {
			throw new Exception("Invalid Driver");
		}

	}

	private DriverEntity dtoToEntity(DriverDto dto) {

		if (dto == null) {
			return null;
		}
		DriverEntity driverEntity = new DriverEntity();

		driverEntity.setDriverName(dto.getName());
		driverEntity.setIdNumber(dto.getIdNumber());
		driverEntity.setIdType(dto.getIdType());

		CabEntity cabEntity = new CabEntity();

		cabEntity.setMake(dto.getCarMake());
		cabEntity.setModel(dto.getCarModel());
		cabEntity.setRegNumber(dto.getCarRegNumber());

		cabEntity.setDriver(driverEntity);

		driverEntity.setCab(cabEntity);

		return driverEntity;
	}
}
