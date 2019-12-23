package org.bedu.consultorio.repositories;

import org.bedu.consultorio.model.persona.Especialidad;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EspecialidadRepository extends MongoRepository<Especialidad, Long> {

}
