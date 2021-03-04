package edu.fiuba.algo3.modelo.bloque.bloqueDeMovimiento;

import edu.fiuba.algo3.modelo.personaje.Personaje;
import edu.fiuba.algo3.modelo.bloque.Bloque;
import edu.fiuba.algo3.modelo.personaje.direccion.DireccionIzquierda;


public class BloqueMoverIzquierda extends BloqueDeMovimiento {

    public BloqueMoverIzquierda(){
        direccion = new DireccionIzquierda();
    }

    @Override
    public void ejecutar(Personaje unPersonaje) {
        unPersonaje.moverHacia(direccion);
    }

    @Override
    public Bloque inverso(){
        return new BloqueMoverDerecha();
    }
}