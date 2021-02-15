package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.Posicion;

public class   BloqueMoverDerecha implements Bloque {
	
	private Posicion posicion;

	public BloqueMoverDerecha(){
			posicion = new Posicion();
			posicion.aDerecha();
	}

    @Override
    public void ejecutar(Personaje unPersonaje) {
		unPersonaje.mover(posicion);
    }

	public void invertir(){
			posicion.invertir();
	}

}
