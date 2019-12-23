package org.bedu.consultorio.services;

import org.bedu.consultorio.exceptions.RestException;
import org.bedu.consultorio.model.persona.Doctor;
import org.bedu.consultorio.repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class DoctorImp implements DoctorSrevice{
	
	@Autowired
	private DoctorRepository repository;

	@Override
	public Doctor saveDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		if (repository.existsById(doctor.getIdEmpleado())) {
			throw new RestException("Ya existe un Doctor con este Id");
		} else {
			
			return repository.save(doctor);

		}
	}

	@Override
	public Doctor getDoctor(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Doctor updateDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteDoctor(Long id) {
		// TODO Auto-generated method stub
		
	}
	
	

}
