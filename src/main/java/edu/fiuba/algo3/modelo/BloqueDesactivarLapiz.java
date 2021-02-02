package edu.fiuba.algo3.modelo;

public class BloqueDesactivarLapiz extends Bloque {

    @Override
    public void ejecutar(Personaje unPersonaje) {
        unPersonaje.desactivarLapiz();
    }
}
