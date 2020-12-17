package edu.fiuba.algo3.modelo;

public class BloqueMoverDerecha extends Bloque{

    @Override
    public void ejecutar(Personaje unPersonaje) {
        unPersonaje.moverADerecha();
    }

}
