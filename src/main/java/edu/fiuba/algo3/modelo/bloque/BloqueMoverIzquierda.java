package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.Posicion;

public class BloqueMoverIzquierda implements Bloque {

    @Override
    public void ejecutar(Personaje unPersonaje) {
        unPersonaje.mover(Posicion.izquierdaDe(unPersonaje.getPosicion()));
    }

    @Override
    public Bloque inverso(){
        return new BloqueMoverDerecha();
    }
}
