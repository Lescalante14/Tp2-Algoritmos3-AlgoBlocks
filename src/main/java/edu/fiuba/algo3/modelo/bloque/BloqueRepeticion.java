package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.Algoritmo;
import edu.fiuba.algo3.modelo.Personaje;

public class BloqueRepeticion implements Bloque{

    private int iteraciones;
    private Algoritmo algoritmo;

    public BloqueRepeticion(int iteraciones, Algoritmo algoritmo) {
        this.iteraciones = iteraciones;
        this.algoritmo = algoritmo;
    }

    @Override
    public void ejecutar(Personaje unPersonaje) {
        for (int i = 0; i<iteraciones; i++){
            algoritmo.ejecutarAlgoritmo(unPersonaje);
        }
    }

}
