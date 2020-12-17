package edu.fiuba.algo3.modelo;

public class BloqueMoverAbajo extends Bloque {
    @Override
    public void ejecutar(Personaje unPersonaje) {
        unPersonaje.moverAbajo();
    }
}
