package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.bloque.Bloque;

public class BloqueMoverArriba extends Bloque {
    @Override
    public void ejecutar(Personaje unPersonaje) {
        unPersonaje.moverArriba();
    }
}
