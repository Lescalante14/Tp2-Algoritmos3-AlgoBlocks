package edu.fiuba.algo3.modelo.bloque.bloqueDeActivacion;

import edu.fiuba.algo3.modelo.personaje.lapiz.EstadoActivado;
import edu.fiuba.algo3.modelo.personaje.Personaje;
import edu.fiuba.algo3.modelo.bloque.Bloque;

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
