package edu.fiuba.algo3.modelo.*;

import edu.fiuba.algo3.modelo.*;

public class ValidaAlgoritmo {

	public static boolean algoritmoValido(int cantidadBloques){
		if(cantidadBloques > 0){
			return true;
		}else{
			return new AlgoritmoVacioError();
		}
	}




}
