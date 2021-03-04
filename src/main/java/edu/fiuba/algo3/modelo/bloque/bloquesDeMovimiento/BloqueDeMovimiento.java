package edu.fiuba.algo3.modelo.bloque.bloquesDeMovimiento;

import edu.fiuba.algo3.modelo.personaje.Personaje;
import edu.fiuba.algo3.modelo.bloque.Bloque;
import edu.fiuba.algo3.modelo.personaje.direccion.Direccion;

public abstract class BloqueDeMovimiento implements Bloque {
    Direccion direccion;

    public void ejecutar(Personaje unPersonaje) {
        unPersonaje.moverHacia(direccion);
    }

}
