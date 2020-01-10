package org.bedu.consultorio.repositories;

import org.bedu.consultorio.model.persona.Contacto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContactoRepository extends MongoRepository<Contacto, Long>{

}
