package org.bedu.consultorio.controller;

import org.bedu.consultorio.model.persona.Contacto;
import org.bedu.consultorio.services.ContactoService;
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
@RequestMapping("/contacto/")
public class ContactoController {
	
	@Autowired
	private ContactoService contactoService;
	
	@PostMapping("/saveContacto")
	public Contacto saveContacto(@RequestBody Contacto contacto) {
		try {
			return contactoService.saveContacto(contacto);
		}catch(RestException e) {
			throw new ResponseStatusException(HttpStatus.CONFLICT, e.getMessage());
		}
	}
	
	@GetMapping("/getContacto/{id}")
	public Contacto getContacto(@PathVariable Long id ) {
		try {
			return contactoService.getContacto(id);
		}catch(RestException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}
	
	@PutMapping("/updateContacto/{id}")
	public Contacto updateContacto(@RequestBody Contacto contacto) {
		try {
			return contactoService.updateContacto(contacto);
		}catch(RestException e) {
			throw new ResponseStatusException(HttpStatus.CONFLICT, e.getMessage());
		}
	}
	
	@DeleteMapping("/deleteContacto/{id}")
	public void deleteContacto(@PathVariable Long id) {
		try {
		   contactoService.deleteContacto(id);
		}catch(RestException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}
}