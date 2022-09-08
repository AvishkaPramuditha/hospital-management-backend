package com.hcl.lk.hms.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.hcl.lk.hms.model.Patient;

public interface PatientRepository extends CrudRepository<Patient, Integer>{
	
	List<Patient> findByOrderById();
}
