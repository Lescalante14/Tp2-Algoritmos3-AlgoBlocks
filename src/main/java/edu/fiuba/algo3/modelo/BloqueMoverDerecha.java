package edu.fiuba.algo3.modelo;

public class BloqueMoverDerecha extends Bloque{

    @Override
    public void ejecutar(Personaje unPersonaje){
       Posicion nuevaPosicion = new Posicion((unPersonaje.getPosicion()).getCoordenadaX()+1, unPersonaje.getPosicion()).getCoordenadaY());
        personaje.setPosicion(nuevaPosicion);
    }

}
