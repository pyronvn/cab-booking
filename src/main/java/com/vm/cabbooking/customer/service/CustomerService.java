package com.vm.cabbooking.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vm.cabbooking.customer.dto.CustomerDto;
import com.vm.cabbooking.customer.entity.CustomerEntity;
import com.vm.cabbooking.driver.entity.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository repository;

	public String addCustomer(CustomerDto dto) throws Exception {

		CustomerEntity dtoToEntity = dtoToEntity(dto);

		if (dtoToEntity != null) {

			repository.save(dtoToEntity);
			return "Added Customer Successfully";
		} else {
			throw new Exception("Cannot add customer");
		}
	}

	private CustomerEntity dtoToEntity(CustomerDto dto) {

		if (dto != null) {

			CustomerEntity entity = new CustomerEntity();
			entity.setEmail(dto.getEmail());
			entity.setMobileNumber(dto.getMobileNumber());
			entity.setName(dto.getCustomerName());

			return entity;
		}
		return null;
	}
}
