package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.Personaje;

public class BloqueMoverArriba implements Bloque {
    @Override
    public void ejecutar(Personaje unPersonaje) {
        unPersonaje.moverArriba();
    }
    @Override
    public Bloque inverso(){
        return new BloqueMoverAbajo();
    }
}
