package org.formacion;

import java.util.List;

public interface Agrupador {

	void add (Object elemento);
	
	int numeroElementos();
	
	default void addAll(List<Object> contenido) {
		
		for (Object object : contenido) {
			add(object);
		}
	}
}
