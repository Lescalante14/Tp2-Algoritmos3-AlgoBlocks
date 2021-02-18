package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.EstadoDesactivado;
import edu.fiuba.algo3.modelo.Personaje;

public class BloqueDesactivarLapiz implements Bloque {

    @Override
    public void ejecutar(Personaje unPersonaje) {
        unPersonaje.cambiarEstadoLapiz(new EstadoDesactivado());
    }

    @Override
    public Bloque inverso(){
        return new BloqueActivarLapiz();
    }
}
