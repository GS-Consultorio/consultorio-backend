package org.bedu.consultorio.services;

import org.bedu.consultorio.model.persona.Paciente;

public interface PacienteService {
	Paciente savePaciente(Paciente paciente);
	Paciente getPaciente(Long id);
	Paciente updatePaciente(Paciente paciente);
	void deletePaciente(Long id);
}
