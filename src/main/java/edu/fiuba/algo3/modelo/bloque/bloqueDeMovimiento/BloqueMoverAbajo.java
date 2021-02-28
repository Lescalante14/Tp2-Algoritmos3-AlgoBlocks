package edu.fiuba.algo3.modelo.bloque.bloqueDeMovimiento;

import edu.fiuba.algo3.modelo.bloque.Bloque;
import edu.fiuba.algo3.modelo.direccion.DireccionAbajo;

public class BloqueMoverAbajo extends BloqueDeMovimiento {

    public BloqueMoverAbajo(){
        direccion = new DireccionAbajo();
    }

    @Override
    public Bloque inverso(){
        return new BloqueMoverArriba();
    }

}
