package org.bedu.consultorio.repositories;

import org.bedu.consultorio.model.consulta.Cita;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CitaRepository extends MongoRepository<Cita, Long>{

}
