package org.bedu.consultorio.model.consulta;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Diagnostico {
	private String sintomas;
	private String signos;
}
