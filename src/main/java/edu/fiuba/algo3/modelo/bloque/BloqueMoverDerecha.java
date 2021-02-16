package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.Personaje;

public class   BloqueMoverDerecha implements Bloque {

    @Override
    public void ejecutar(Personaje unPersonaje) {
        unPersonaje.moverADerecha() ;
    }

    @Override
    public Bloque inverso(){
        return new BloqueMoverIzquierda();
    }
}
