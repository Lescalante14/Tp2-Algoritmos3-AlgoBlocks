package edu.fiuba.algo3.modelo;

public class BloqueSubirLapiz extends Bloque {

    @Override
    public void ejecutar(Personaje unPersonaje) {
        unPersonaje.desactivarLapiz();

    }
}
