package org.bedu.consultorio.services;

import org.bedu.consultorio.exceptions.RestException;

public interface Crud<E> {
	E save(E e);
	E get(Long id) throws RestException;
	E update(E e);
	void delete(Long id);
}
