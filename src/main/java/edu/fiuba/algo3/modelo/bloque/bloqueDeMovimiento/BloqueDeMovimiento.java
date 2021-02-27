package edu.fiuba.algo3.modelo.bloque.bloqueDeMovimiento;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.bloque.Bloque;
import edu.fiuba.algo3.modelo.direccion.Direccion;

public abstract class BloqueDeMovimiento implements Bloque {
    Direccion direccion;

    public void ejecutar(Personaje unPersonaje) {
        unPersonaje.moverHacia(direccion);
    }

}
