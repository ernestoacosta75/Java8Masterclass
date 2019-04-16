package com.formacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public interface Traductor {

	static Locale obtenLocaleEntorno() {
		return Locale.getDefault();
	}
	
	String traduccion(Locale locale, String clave);
	
	default List<String> traduccion(Locale locale, List<String> claves) {
		List<String> traducciones = new ArrayList<String>();
		
		for (String clave : claves) {
			traducciones.add(traduccion(locale, clave));
		}
		
		return traducciones;
	}
}
