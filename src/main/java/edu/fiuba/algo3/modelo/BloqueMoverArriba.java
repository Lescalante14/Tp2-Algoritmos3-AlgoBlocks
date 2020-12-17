package edu.fiuba.algo3.modelo;

public class BloqueMoverArriba extends Bloque {
    @Override
    public void ejecutar(Personaje unPersonaje) {
        unPersonaje.moverArriba();
    }
}
