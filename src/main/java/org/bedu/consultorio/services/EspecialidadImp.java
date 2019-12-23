package org.bedu.consultorio.services;

import org.bedu.consultorio.exceptions.RestException;
import org.bedu.consultorio.model.persona.Especialidad;
import org.bedu.consultorio.repositories.EspecialidadRepository;
import org.springframework.beans.factory.annotation.Autowired;


public class EspecialidadImp implements EspecialidadService{
	
	@Autowired
	private EspecialidadRepository repository;

	@Override
	public Especialidad saveEspecialidad(Especialidad especialidad) {
		// TODO Auto-generated method stub
		if (repository.existsById(especialidad.getIdEspecialidad())) {
			throw new RestException("Ya existe una Especialidad");
		} else {
			return repository.save(especialidad);
		}
	}

	@Override
	public Especialidad getEspecialidad(Long id) {
		// TODO Auto-generated method stub
		if (!repository.existsById(id)) {
			throw new RestException("Se requiere una Id para obtener la Especialidad");
		} else {
			return repository.findById(id).get();
		}
	}

	@Override
	public Especialidad updateEspecialidad(Especialidad especialidad) {
		// TODO Auto-generated method stub
		if (!repository.existsById(especialidad.getIdEspecialidad())) {
			throw new RestException("Ya existe una Especialidad con ese ID");
		} else {
			return repository.save(especialidad);
		}
	}

	@Override
	public void deleteEspecialidad(Long id) {
		// TODO Auto-generated method stub
		if (!repository.existsById(id)) {
			throw new RestException("Se requiere un id para eliminar la especialidad");
		} else {
			repository.deleteById(id);
		}		
	}
	
	

}
