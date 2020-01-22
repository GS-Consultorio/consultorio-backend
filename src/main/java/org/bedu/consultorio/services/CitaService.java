package org.bedu.consultorio.services;

import org.bedu.consultorio.model.consulta.Cita;

public interface CitaService {
	Cita saveCita(Cita cita);
	Cita getCita(Long id);
	Cita updateCita(Cita cita);
	void deleteCita(Long id);
}
