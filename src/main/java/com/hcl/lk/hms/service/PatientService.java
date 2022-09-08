package com.hcl.lk.hms.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.lk.hms.exception.ResourceNotFoundException;
import com.hcl.lk.hms.model.Patient;
import com.hcl.lk.hms.repository.PatientRepository;

@Service
public class PatientService {
	
	@Autowired
	private PatientRepository repository;
	
	public List<Patient> getAllPatients() {
		/*Iterable<Patient> patients = repository.findAll();
		List<Patient> list = new ArrayList<Patient>();
		
		for(Patient p: patients) {
			list.add(p);
		}*/
		List<Patient> list = repository.findByOrderById();
		return list;
	}
	
	public Patient findById(int patientId) {
		Patient patient = null;
		Optional<Patient> opt = repository.findById(patientId);
		if(opt.isPresent()) {
			patient = opt.get();
		}
		return patient;
	}
	
	
	public Patient addPatient(Patient p) {
		if(p == null) {
			throw new NullPointerException("Patient object is null in class - PatientService and method: addPatient");
		}
		return repository.save(p);
	}
	
	public Patient updatePatient(Patient p) {
		if(p == null) {
			throw new NullPointerException("Patient object is null in class - PatientService and method: updatePatient");
		}
		
		Patient patient = null;
		Optional<Patient> opt = repository.findById(p.getId());
		if(opt.isPresent()) {
			patient = opt.get();
		}
		else {
			throw new ResourceNotFoundException("Patient", "Id", p.getId());
		}
		return repository.save(p);
	}
	
	public void deletePatient(int patientId) {
		
		
		Optional<Patient> opt = repository.findById(patientId);
		if(!opt.isPresent()) {
			throw new ResourceNotFoundException("Patient", "Id", patientId);
		}
		repository.deleteById(patientId);
	}
}
