package org.bedu.consultorio.controller;

import org.bedu.consultorio.model.persona.Paciente;
import org.bedu.consultorio.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import org.bedu.consultorio.exceptions.RestException;

@RestController
@RequestMapping("/paciente/")
public class PacienteCotnroller {
	
	@Autowired
	private PacienteService pacienteService;
	
	@PostMapping("/savePaciente")
	public Paciente savePaciente(@RequestBody Paciente paciente) {
		return pacienteService.savePaciente(paciente);
	}
	
	@GetMapping("/getPaciente/{id}")
	public Paciente getAutor(@PathVariable Long id ) {
		try {
			return pacienteService.getPaciente(id);
		}catch(RestException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}
	
}