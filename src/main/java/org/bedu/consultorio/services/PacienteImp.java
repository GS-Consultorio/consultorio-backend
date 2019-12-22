package org.bedu.consultorio.services;

import org.bedu.consultorio.exceptions.RestException;
import org.bedu.consultorio.model.persona.Paciente;
import org.bedu.consultorio.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteImp implements PacienteService{
	
	@Autowired
	private PacienteRepository repository;

	@Override
	public Paciente savePaciente(Paciente paciente) {
		return repository.save(paciente);
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
	public Paciente updatePaciente(Paciente e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePaciente(Long id) {
		// TODO Auto-generated method stub
		
	}
	
	

}
