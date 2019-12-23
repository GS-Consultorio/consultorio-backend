package org.bedu.consultorio.services;

import org.bedu.consultorio.model.persona.Doctor;

public interface DoctorSrevice {
	
	Doctor saveDoctor(Doctor doctor);
	Doctor getDoctor(Long id);
	Doctor updateDoctor(Doctor doctor);
	void deleteDoctor(Long id);

}
