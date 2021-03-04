package edu.fiuba.algo3.modelo.validaciones;


import edu.fiuba.algo3.excepciones.AlgoritmoVacioError;

public class ValidaAlgoritmo {

	public static boolean algoritmoValido(int cantidadBloques) throws RuntimeException{
		if(cantidadBloques > 0){
			return true;
		}
		throw new AlgoritmoVacioError();

	}

}
