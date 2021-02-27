package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.direccion.Direccion;
import edu.fiuba.algo3.modelo.direccion.DireccionAbajo;

public class BloqueMoverAbajo implements Bloque {

    Direccion direccion;

    public BloqueMoverAbajo(){
        Direccion direccion = new DireccionAbajo();
    }

    @Override
    public void ejecutar(Personaje unPersonaje) {
        unPersonaje.mover(direccion);
    }

    @Override
    public Bloque inverso(){
        return new BloqueMoverArriba();
    }

}
