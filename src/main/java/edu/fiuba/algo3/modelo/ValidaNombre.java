package edu.fiuba.algo3.modelo;
import edu.fiuba.algo3.excepciones.NombreVacioError;

public class ValidaNombre{
	
	public static void nombreValido(String nombre){

		if( (nombre == null) || (nombre.trim().length() > 0)){
			return new NombreVacioError();
		}else{
				return true;
		}
	}


}
