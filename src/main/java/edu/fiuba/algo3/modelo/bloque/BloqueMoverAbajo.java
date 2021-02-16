package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.Personaje;

public class BloqueMoverAbajo implements Bloque {
    @Override
    public void ejecutar(Personaje unPersonaje) {
        unPersonaje.moverAbajo();
    }

    @Override
    public Bloque inverso(){
        return new BloqueMoverArriba();
    }

}
