package com.hcl.lk.hms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.lk.hms.model.Patient;
import com.hcl.lk.hms.service.PatientService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class PatientController {
	
	
	@Autowired
	private PatientService service;
	
	
	@GetMapping("/patients")
	public ResponseEntity<List<Patient>> getAllPatients() {
		List<Patient> patients =  service.getAllPatients();
		ResponseEntity<List<Patient>> response = new ResponseEntity<List<Patient>>(patients, HttpStatus.OK);
		return response;
	}
	
	
	@GetMapping("/patients/{id}")
	public ResponseEntity<Patient> findById(@PathVariable("id")int patientId) {
		Patient patient =  service.findById(patientId);
		ResponseEntity<Patient> response = new ResponseEntity<Patient>(patient, HttpStatus.OK);
		return response;
	}
	
	
	
	@PostMapping("/patients")
	public ResponseEntity<Patient> addPatient(@RequestBody Patient p) {
		
		Patient patient =  service.addPatient(p);
		ResponseEntity<Patient> response = new ResponseEntity<Patient>(patient, HttpStatus.CREATED);
		return response;
	}
	
	
	@PutMapping("/patients/{id}")
	public ResponseEntity<Patient> updatePatient(@PathVariable("id") int patientId, @RequestBody Patient p) {
		
		p.setId(patientId);
		Patient patient =  service.updatePatient(p);
		ResponseEntity<Patient> response = new ResponseEntity<Patient>(patient, HttpStatus.OK);
		return response;
	}
	
	
	@DeleteMapping("/patients/{id}")
	public void deletePatient(@PathVariable("id")int patientId) {
		service.deletePatient(patientId);
	}
}
