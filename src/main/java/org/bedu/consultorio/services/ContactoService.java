package org.bedu.consultorio.services;

import org.bedu.consultorio.model.persona.Contacto;

public interface ContactoService {
	Contacto saveContacto(Contacto contacto);
	Contacto getContacto(Long id);
	Contacto updateContacto(Contacto contacto);
	void deleteContacto(Long id);
}
