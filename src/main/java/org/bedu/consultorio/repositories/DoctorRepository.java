package org.bedu.consultorio.repositories;

import org.bedu.consultorio.model.persona.Doctor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DoctorRepository extends MongoRepository<Doctor, Long>{

}
