package edu.fiuba.algo3.modelo.bloque.bloqueDeActivacion;


import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.bloque.Bloque;
import edu.fiuba.algo3.modelo.lapiz.EstadoDesactivado;

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
