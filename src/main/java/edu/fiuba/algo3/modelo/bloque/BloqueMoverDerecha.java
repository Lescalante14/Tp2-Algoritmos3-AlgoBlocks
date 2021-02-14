package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.Posicion;

public class   BloqueMoverDerecha implements Bloque {

    @Override
    public void ejecutar(Personaje unPersonaje) {
	Posicion unaPosicion = new Posicion();
	unaPosicion.aDerecha();
	unPersonaje.mover(unaPosicion);
    }

}
