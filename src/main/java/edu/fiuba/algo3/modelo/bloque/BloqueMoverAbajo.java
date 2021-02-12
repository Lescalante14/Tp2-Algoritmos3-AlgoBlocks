package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.Posicion;

public class BloqueMoverAbajo implements Bloque {
    @Override
    public void ejecutar(Personaje unPersonaje) {
        //unPersonaje.moverAbajo();
	Posicion unaPosicion = new Posicion(0,-1);
	unPersonaje.mover(unaPosicion);
    }
}
