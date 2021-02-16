package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.Algoritmo;
import edu.fiuba.algo3.modelo.Personaje;

public class BloqueRepeticion implements Bloque{

    private int iteraciones;
    private Algoritmo algoritmo;

    public BloqueRepeticion(int iteraciones) {
        this.iteraciones = iteraciones;
        this.algoritmo = new Algoritmo();
    }

    @Override
    public void ejecutar(Personaje unPersonaje) {
        for (int i = 0; i<iteraciones; i++){
            algoritmo.ejecutarAlgoritmo(unPersonaje);
        }
    }

    public void agregarBloque(Bloque bloqueAgregar){

        this.algoritmo.agregarBloque(bloqueAgregar);

    }

    @Override
    public Bloque inverso(){

    }

}
