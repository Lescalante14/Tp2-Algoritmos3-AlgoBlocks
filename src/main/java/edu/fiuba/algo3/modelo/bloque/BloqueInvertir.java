package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.algortimo.Algoritmo;
import edu.fiuba.algo3.modelo.personaje.Personaje;


public class BloqueInvertir implements Bloque{

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
