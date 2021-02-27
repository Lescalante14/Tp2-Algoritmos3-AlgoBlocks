package edu.fiuba.algo3.excepciones;


public class ValidaAlgoritmo {

	public static boolean algoritmoValido(int cantidadBloques){
		if(cantidadBloques > 0){
			return true;
		}else{
			return new AlgoritmoVacioError();
		}
	}

}
