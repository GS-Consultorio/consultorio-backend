package org.bedu.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.bedu.consultorio.BackendConsultorioApplication;
import org.bedu.consultorio.exceptions.RestException;
import org.bedu.consultorio.model.persona.Doctor;
import org.bedu.consultorio.model.persona.Especialidad;
import org.bedu.consultorio.model.persona.Paciente;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

public class backendConsultorioApplicationTest {

	@Test
	public void test() {
		BackendConsultorioApplication.main(new String[] {
		});
	}
	
}


