package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.Algoritmo;
import edu.fiuba.algo3.modelo.Personaje;


public class BloqueInvertir implements Bloque, BloquesDeSecuencia{

    private Algoritmo algoritmo;

    public BloqueInvertir() {
        this.algoritmo = new Algoritmo();
    }

    public void ejecutar(Personaje unPersonaje){
        algoritmo.ejecutarAlgoritmo(unPersonaje);
    }

    public void agregarBloque(Bloque bloque) {

        this.algoritmo.agregarBloque(bloque.inverso());
    }

    public Bloque inverso(){
        return this;
    }

}
