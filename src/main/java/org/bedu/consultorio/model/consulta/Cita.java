package org.bedu.consultorio.model.consulta;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "citas")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cita {
	@Id
	private Long idCita;
	private Date fecha;
	private Long idCliente;
	private Long idEmpleado;
	private Boolean estado;
	private Diagnostico diagnostico;
}