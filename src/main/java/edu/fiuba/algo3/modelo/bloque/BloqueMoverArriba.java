package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.Posicion;


public class BloqueMoverArriba implements Bloque {
   
	private Posicion posicion;   
	
	public BloqueMoverArriba(){
			posicion = new Posicion();
			posicion.aArriba();
	}

	@Override
    public void ejecutar(Personaje unPersonaje) {
		unPersonaje.mover(posicion);
    }

	public void invertir(){
		posicion.invertir();
	}
}
