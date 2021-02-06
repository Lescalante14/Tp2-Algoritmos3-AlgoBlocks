package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.bloque.Bloque;

public class   BloqueMoverDerecha extends Bloque {

    @Override
    public void ejecutar(Personaje unPersonaje) {
        unPersonaje.moverADerecha() ;
    }

}
