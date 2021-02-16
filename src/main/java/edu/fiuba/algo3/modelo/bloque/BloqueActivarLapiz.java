package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.Lapiz;
import edu.fiuba.algo3.modelo.Personaje;

public class BloqueActivarLapiz implements Bloque {

    @Override
    public void ejecutar(Personaje unPersonaje){
        Lapiz lapizActivo = new Lapiz();
        lapizActivo.activar();
        unPersonaje.cambiarLapiz(lapizActivo);
    }
}
