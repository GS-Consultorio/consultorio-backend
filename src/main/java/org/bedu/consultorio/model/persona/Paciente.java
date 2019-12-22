package org.bedu.consultorio.model.persona;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "pacientes")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Paciente extends Persona {
	
	@Id
	private Long idCliente;
	private String telefono;
	private Date fechaNac;
	private String curp;
}
