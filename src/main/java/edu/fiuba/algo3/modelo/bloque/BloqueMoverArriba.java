package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.Posicion;

public class BloqueMoverArriba implements Bloque {
    @Override
    public void ejecutar(Personaje unPersonaje) {

        unPersonaje.mover(Posicion.arribaDe(unPersonaje.getPosicion()));
    }
    @Override
    public Bloque inverso(){
        return new BloqueMoverAbajo();
    }
}
