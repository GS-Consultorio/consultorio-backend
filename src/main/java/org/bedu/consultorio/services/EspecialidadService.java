package org.bedu.consultorio.services;

import org.bedu.consultorio.model.persona.Especialidad;

public interface EspecialidadService {
	
	Especialidad saveEspecialidad (Especialidad especialidad);
	Especialidad getEspecialidad (Long id);
	Especialidad updateEspecialidad (Especialidad especialidad);
	void deleteEspecialidad (Long id);

}
