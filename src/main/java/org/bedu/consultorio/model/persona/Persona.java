package org.bedu.consultorio.model.persona;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
public class Persona {
	protected String nombres;
	protected String apellidos;
	protected String email;
}
