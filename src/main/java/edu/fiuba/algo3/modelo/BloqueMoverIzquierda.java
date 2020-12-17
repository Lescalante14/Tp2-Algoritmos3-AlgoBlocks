package edu.fiuba.algo3.modelo;

public class BloqueMoverIzquierda extends Bloque {

    @Override
    public void ejecutar(Personaje unPersonaje) {
        unPersonaje.moverAIzquierda();
    }
}
