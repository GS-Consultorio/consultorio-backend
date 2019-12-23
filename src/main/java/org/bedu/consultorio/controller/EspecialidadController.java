package org.bedu.consultorio.controller;

import org.bedu.consultorio.exceptions.RestException;
import org.bedu.consultorio.model.persona.Especialidad;
import org.bedu.consultorio.services.EspecialidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/especialidad/")

public class EspecialidadController {
	
	@Autowired
	private EspecialidadService especialidadService;
	
	@PostMapping("/saveEspecialidad")
	public Especialidad saveEspecialidad(@RequestBody Especialidad especialidad) {
		try {
			return especialidadService.saveEspecialidad(especialidad);
		} catch (RestException e) {
			// TODO: handle exception
			throw new ResponseStatusException(HttpStatus.CONFLICT, e.getMessage());
		}
	}
	
	@GetMapping("/updateEspecialidad/{id}")
	public Especialidad updateEspecialidad(@RequestBody Especialidad especialidad) {
		try {
			return especialidadService.updateEspecialidad(especialidad);
		} catch (RestException e) {
			// TODO: handle exception
			throw new ResponseStatusException(HttpStatus.CONFLICT, e.getMessage());
		}
	}
	
	@DeleteMapping("/deleteEspecialidad/{id}")
	public void deleteEspecialidad(@PathVariable Long id) {
		try {
			especialidadService.deleteEspecialidad(id);
		} catch (RestException e) {
			// TODO: handle exception
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

}
