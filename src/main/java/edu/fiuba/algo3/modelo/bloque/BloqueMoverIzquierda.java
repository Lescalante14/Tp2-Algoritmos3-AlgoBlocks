package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.Posicion;

public class BloqueMoverIzquierda implements Bloque {
	
	private Posicion posicion;

	public BloqueMoverIzquierda(){
		posicion = new Posicion();
		posicion.aIzquierda();
	}

    @Override
    public void ejecutar(Personaje unPersonaje) {
		unPersonaje.mover(posicion);
    }

	public void invertir(){
			posicion.invertir();
	}
}
