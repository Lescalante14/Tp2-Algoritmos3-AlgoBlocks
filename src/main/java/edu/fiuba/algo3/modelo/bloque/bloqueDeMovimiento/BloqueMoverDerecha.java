package edu.fiuba.algo3.modelo.bloque.bloqueDeMovimiento;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.bloque.Bloque;
import edu.fiuba.algo3.modelo.direccion.Direccion;
import edu.fiuba.algo3.modelo.direccion.DireccionDerecha;

public class   BloqueMoverDerecha extends BloqueDeMovimiento {


    public BloqueMoverDerecha(){
        direccion = new DireccionDerecha();
    }

    @Override
    public void ejecutar(Personaje unPersonaje) {
        unPersonaje.moverHacia(direccion);
    }

    @Override
    public Bloque inverso(){
        return new BloqueMoverIzquierda();
    }
}
