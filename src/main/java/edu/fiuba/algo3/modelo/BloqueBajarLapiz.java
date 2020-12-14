package edu.fiuba.algo3.modelo;

public class BloqueBajarLapiz extends Bloque{

    @Override
    public void ejecutar(Personaje unPersonaje){
        unPersonaje.activarLapiz();
    }
}
