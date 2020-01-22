package org.bedu.consultorio.repositories;

import org.bedu.consultorio.model.persona.Paciente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface PacienteRepository extends MongoRepository<Paciente, Long>{

}
