package edu.fiuba.algo3.modelo;

public class BloqueActivarLapiz extends Bloque{

    @Override
    public void ejecutar(Personaje unPersonaje){
        unPersonaje.activarLapiz();
    }
}
