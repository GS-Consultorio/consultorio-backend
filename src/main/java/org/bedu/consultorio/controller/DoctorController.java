package org.bedu.consultorio.controller;

import org.bedu.consultorio.exceptions.RestException;
import org.bedu.consultorio.model.persona.Doctor;
import org.bedu.consultorio.services.DoctorSrevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/doctores/")

public class DoctorController {
	
	@Autowired
	private DoctorSrevice doctorService;
	
	 @PostMapping("/saveDoctor")
	public Doctor savePaciente(@RequestBody Doctor doctor) {
		try {
			return doctorService.saveDoctor(doctor);
		}catch(RestException e) {
			throw new ResponseStatusException(HttpStatus.CONFLICT, e.getMessage());
		}
	}
	
	@GetMapping("/getDoctor/{id}")
	public Doctor getPaciente(@PathVariable Long id ) {
		try {
			return doctorService.getDoctor(id);
		}catch(RestException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}
	
	@PutMapping("/updateDoctor/{id}")
	public Doctor updatePaciente(@RequestBody Doctor doctor) {
		try {
			return doctorService.updateDoctor(doctor);
		}catch(RestException e) {
			throw new ResponseStatusException(HttpStatus.CONFLICT, e.getMessage());
		}
	}
	
	@DeleteMapping("/deleteDoctor/{id}")
	public void deletePaciente(@PathVariable Long id) {
		try {
			doctorService.deleteDoctor(id);
		}catch(RestException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}
	 

}
