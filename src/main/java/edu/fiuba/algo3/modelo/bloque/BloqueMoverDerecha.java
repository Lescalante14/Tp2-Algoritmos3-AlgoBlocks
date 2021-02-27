package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.direccion.Direccion;
import edu.fiuba.algo3.modelo.direccion.DireccionDerecha;

public class   BloqueMoverDerecha implements Bloque {

    Direccion direccion;

    public BloqueMoverDerecha(){
        Direccion direccion = new DireccionDerecha();
    }

    @Override
    public void ejecutar(Personaje unPersonaje) {
        unPersonaje.mover(direccion);
    }

    @Override
    public Bloque inverso(){
        return new BloqueMoverIzquierda();
    }
}
