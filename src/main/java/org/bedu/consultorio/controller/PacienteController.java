package org.bedu.consultorio.controller;

import org.bedu.consultorio.model.persona.Paciente;
import org.bedu.consultorio.services.PacienteService;
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

import org.bedu.consultorio.exceptions.RestException;

@RestController
@RequestMapping("/paciente/")
public class PacienteController {
	
	@Autowired
	private PacienteService pacienteService;
	
	@PostMapping("/savePaciente")
	public Paciente savePaciente(@RequestBody Paciente paciente) {
		try {
			return pacienteService.savePaciente(paciente);
		}catch(RestException e) {
			throw new ResponseStatusException(HttpStatus.CONFLICT, e.getMessage());
		}
	}
	
	@GetMapping("/getPaciente/{id}")
	public Paciente getPaciente(@PathVariable Long id ) {
		try {
			return pacienteService.getPaciente(id);
		}catch(RestException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}
	
	@PutMapping("/updatePaciente/{id}")
	public Paciente updatePaciente(@RequestBody Paciente paciente) {
		try {
			return pacienteService.updatePaciente(paciente);
		}catch(RestException e) {
			throw new ResponseStatusException(HttpStatus.CONFLICT, e.getMessage());
		}
	}
	
	@DeleteMapping("/deletePaciente/{id}")
	public void deletePaciente(@PathVariable Long id) {
		try {
			pacienteService.deletePaciente(id);
		}catch(RestException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}
}