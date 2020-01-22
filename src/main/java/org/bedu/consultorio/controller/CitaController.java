package org.bedu.consultorio.controller;

import org.bedu.consultorio.exceptions.RestException;
import org.bedu.consultorio.model.consulta.Cita;
import org.bedu.consultorio.services.CitaService;
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
@RequestMapping("/cita/")
public class CitaController {
	
	@Autowired
	private CitaService citaService;
	
	@PostMapping("/saveCita")
	public Cita saveCita(@RequestBody Cita cita) {
		try {
			return citaService.saveCita(cita);
		}catch(RestException e) {
			throw new ResponseStatusException(HttpStatus.CONFLICT, e.getMessage());
		}
	}
	
	@GetMapping("/getCita/{id}")
	public Cita getCita(@PathVariable Long id ) {
		try {
			return citaService.getCita(id);
		}catch(RestException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}
	
	@PutMapping("/updateCita/{id}")
	public Cita updateCita(@RequestBody Cita cita) {
		try {
			return citaService.updateCita(cita);
		}catch(RestException e) {
			throw new ResponseStatusException(HttpStatus.CONFLICT, e.getMessage());
		}
	}
	
	@DeleteMapping("/deleteCita/{id}")
	public void deleteCita(@PathVariable Long id) {
		try {
			citaService.deleteCita(id);
		}catch(RestException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}
}
