package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.personaje.Personaje;
import edu.fiuba.algo3.modelo.posicion.Posicion;

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
