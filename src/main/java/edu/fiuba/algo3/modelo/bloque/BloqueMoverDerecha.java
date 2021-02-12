package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.Posicion;

public class   BloqueMoverDerecha implements Bloque {

    @Override
    public void ejecutar(Personaje unPersonaje) {
        //unPersonaje.moverADerecha() ;
	Posicion unaPosicion = new Posicion(1,0);
	unPersonaje.mover(unaPosicion);
    }

}
