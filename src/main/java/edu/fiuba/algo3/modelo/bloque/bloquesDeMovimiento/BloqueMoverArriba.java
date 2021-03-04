package edu.fiuba.algo3.modelo.bloque.bloqueDeMovimiento;

import edu.fiuba.algo3.modelo.personaje.Personaje;
import edu.fiuba.algo3.modelo.bloque.Bloque;
import edu.fiuba.algo3.modelo.personaje.direccion.DireccionArriba;

public class BloqueMoverArriba extends BloqueDeMovimiento {


    public BloqueMoverArriba(){
        direccion = new DireccionArriba();
    }

    @Override
    public void ejecutar(Personaje unPersonaje) {
        unPersonaje.moverHacia(direccion);
    }

    @Override
    public Bloque inverso(){
        return new BloqueMoverAbajo();
    }
}
