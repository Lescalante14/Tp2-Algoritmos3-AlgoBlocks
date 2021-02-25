package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.personaje.Personaje;
import edu.fiuba.algo3.modelo.posicion.Posicion;

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
