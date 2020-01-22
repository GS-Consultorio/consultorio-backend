package org.bedu.consultorio.services;

import org.bedu.consultorio.exceptions.RestException;
import org.bedu.consultorio.model.consulta.Cita;
import org.bedu.consultorio.repositories.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitaImp implements CitaService{

	@Autowired
	private CitaRepository repository; 
	
	@Override
	public Cita saveCita(Cita cita) {
		if(repository.existsById( cita.getIdCita() ) ) {
			throw new RestException("Ya existe un cliente con el id");
		}else {
			return repository.save(cita);
		}
	}

	@Override
	public Cita getCita(Long id) {
		if(!repository.existsById(id)) {
			throw new RestException("Se requiere un Id existente para obtener la cita.");
		}else {
			return repository.findById(id).get();
		}
	}

	@Override
	public Cita updateCita(Cita cita) {
		if(!repository.existsById(cita.getIdCliente())) {
			throw new RestException("Ya existe una cita con el id: ");
		}else {
			return repository.save(cita);
		}
	}

	@Override
	public void deleteCita(Long id) {
		if(!repository.existsById(id)) {
			throw new RestException("Se requiere un Id existente para eliminar paciente");
		}else {
			repository.deleteById(id);
		}
		
	}
	
}
