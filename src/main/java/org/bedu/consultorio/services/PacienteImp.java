package org.bedu.consultorio.services;

import org.bedu.consultorio.exceptions.RestException;
import org.bedu.consultorio.model.persona.Paciente;
import org.bedu.consultorio.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteImp implements PacienteService {
	
	@Autowired
	private PacienteRepository repository;

	@Override
	public Paciente savePaciente(Paciente paciente) {
		if(repository.existsById(paciente.getIdCliente())) {
			throw new RestException("Ya existe un cliente con el id");
		}else {
			return repository.save(paciente);
		}
	}

	@Override
	public Paciente getPaciente(Long id) throws RestException {
		if(!repository.existsById(id)) {
			throw new RestException("Se requiere un Id existente para obtener el autor.");
		}else {
			return repository.findById(id).get();
		}
	}

	@Override
	public Paciente updatePaciente(Paciente paciente) {
		if(!repository.existsById(paciente.getIdCliente())) {
			throw new RestException("Ya existe un cliente con el id: ");
		}else {
			return repository.save(paciente);
		}
	}

	@Override
	public void deletePaciente(Long id) {
		if(!repository.existsById(id)) {
			throw new RestException("Se requiere un Id existente para eliminar paciente");
		}else {
			repository.deleteById(id);
		}		
	}
	
}
