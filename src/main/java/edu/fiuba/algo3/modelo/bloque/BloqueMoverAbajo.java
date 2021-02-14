package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.Posicion;

public class BloqueMoverAbajo implements Bloque {
    
	private Posicion posicion;

	public BloqueMoverAbajo(){
			posicion = new Posicion();
			posicion.aAbajo();
	}
		
	@Override
    public void ejecutar(Personaje unPersonaje) {
		unPersonaje.mover(posicion);
    }

	public void invertir(){
		posicion = new Posicion();
		posicion.aArriba();
	}
}
