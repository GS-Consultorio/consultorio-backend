package org.bedu.consultorio.services;

import java.util.List;

import org.bedu.consultorio.model.persona.Paciente;

public interface PacienteService {
	Paciente savePaciente(Paciente paciente);
	List<Paciente> getAllPaciente();
	Paciente getPaciente(Long id);
	Paciente updatePaciente(Paciente paciente);
	void deletePaciente(Long id);
}
