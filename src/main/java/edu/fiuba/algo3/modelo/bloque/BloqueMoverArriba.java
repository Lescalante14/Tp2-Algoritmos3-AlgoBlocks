package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.Posicion;


public class BloqueMoverArriba implements Bloque {
   
	private Posicion unaPosicion;   
	
	public BloqueMoverArriba(){
			unaPosicion = new Posicion();
			unaPosicion.aArriba();
	}

	@Override
    public void ejecutar(Personaje unPersonaje) {
		unPersonaje.mover(unaPosicion);
    }

	public void invertirPosicion(){
		unaPosicion = new Posicion();
		unaPosicion.aAbajo();
	}
}
