package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.direccion.Direccion;
import edu.fiuba.algo3.modelo.direccion.DireccionArriba;

public class BloqueMoverArriba implements Bloque {

    Direccion direccion;
    public BloqueMoverArriba(){
        Direccion direccion = new DireccionArriba();
    }

    @Override
    public void ejecutar(Personaje unPersonaje) {
        unPersonaje.mover(direccion);
    }

    @Override
    public Bloque inverso(){
        return new BloqueMoverAbajo();
    }
}
