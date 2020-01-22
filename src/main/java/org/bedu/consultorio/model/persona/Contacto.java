package org.bedu.consultorio.model.persona;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Contacto {	
	private String nombre;
	private String apellidos;
	private String parentesco;
	private String telefono;
}