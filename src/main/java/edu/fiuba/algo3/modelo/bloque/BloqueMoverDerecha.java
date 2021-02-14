package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.Posicion;

public class   BloqueMoverDerecha implements Bloque {
	
	private Posicion unaPosicion;

	public BloqueMoverDerecha(){
			unaPosicion = new Posicion();
			unaPosicion.aDerecha();
	}

    @Override
    public void ejecutar(Personaje unPersonaje) {
		unPersonaje.mover(unaPosicion);
    }

	public void invertir(){
			unaPosicion = new Posicion();
			unaPosicion.aIzquierda();
	}

}
