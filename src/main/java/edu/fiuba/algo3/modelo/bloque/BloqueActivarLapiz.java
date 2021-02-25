package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.lapiz.EstadoActivado;
import edu.fiuba.algo3.modelo.personaje.Personaje;

public class BloqueActivarLapiz implements Bloque {

    @Override
    public void ejecutar(Personaje unPersonaje){
        unPersonaje.cambiarEstadoLapiz(new EstadoActivado());
    }

    @Override
    public Bloque inverso(){
        return new BloqueDesactivarLapiz();
    }
}
