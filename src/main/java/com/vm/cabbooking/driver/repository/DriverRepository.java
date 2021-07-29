package com.vm.cabbooking.driver.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vm.cabbooking.driver.entity.DriverEntity;

@Repository
public interface DriverRepository extends JpaRepository<DriverEntity, UUID> {

}
