package org.bedu.consultorio.repositories;

import org.bedu.consultorio.model.persona.Paciente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PacienteRepository extends MongoRepository<Paciente, Long>{

}
