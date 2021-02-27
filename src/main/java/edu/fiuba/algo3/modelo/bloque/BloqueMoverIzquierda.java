package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.direccion.Direccion;
import edu.fiuba.algo3.modelo.direccion.DireccionIzquierda;


public class BloqueMoverIzquierda implements Bloque {

    Direccion direccion;
    public BloqueMoverIzquierda(){
        Direccion direccion = new DireccionIzquierda();
    }

    @Override
    public void ejecutar(Personaje unPersonaje) {
        unPersonaje.mover(direccion);
    }

    @Override
    public Bloque inverso(){
        return new BloqueMoverDerecha();
    }
}
