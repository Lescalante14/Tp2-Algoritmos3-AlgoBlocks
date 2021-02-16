package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.Lapiz;
import edu.fiuba.algo3.modelo.Personaje;

public class BloqueDesactivarLapiz implements Bloque {

    @Override
    public void ejecutar(Personaje unPersonaje) {
        Lapiz lapizDesactivado = new Lapiz();
        unPersonaje.cambiarLapiz(lapizDesactivado);
    }
}
