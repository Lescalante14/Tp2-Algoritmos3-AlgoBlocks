package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.Posicion;

public class   BloqueMoverDerecha implements Bloque {

    @Override
    public void ejecutar(Personaje unPersonaje) {
        unPersonaje.mover(Posicion.derechaDe(unPersonaje.getPosicion()));
    }

    @Override
    public Bloque inverso(){
        return new BloqueMoverIzquierda();
    }
}
