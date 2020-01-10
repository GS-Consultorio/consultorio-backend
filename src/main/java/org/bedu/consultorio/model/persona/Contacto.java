package org.bedu.consultorio.model.persona;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "contactos")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Contacto extends Persona {
	
	@Id
	private Long idContacto;
	private String nombre;
	private String apellidos;
	private String parentesco;
	private String telefono;
	
}
