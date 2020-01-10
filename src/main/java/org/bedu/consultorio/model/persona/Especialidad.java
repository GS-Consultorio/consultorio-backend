package org.bedu.consultorio.model.persona;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "especialidad")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Especialidad {	
	@Id
	private Long idEspecialidad;
	private String nombreEspecialidad;
}
