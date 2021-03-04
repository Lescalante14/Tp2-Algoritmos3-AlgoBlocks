package edu.fiuba.algo3.modelo.validaciones;
import edu.fiuba.algo3.excepciones.NombreVacioError;

public class ValidaNombre{
	
	public static boolean nombreValido(String nombre)throws RuntimeException{

		if( (nombre == null) || (nombre.trim().length() < 1)){
			throw new NombreVacioError();
		}
		return true;

	}


}
