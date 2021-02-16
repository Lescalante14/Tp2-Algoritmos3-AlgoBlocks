package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.Algoritmo;
import edu.fiuba.algo3.modelo.Personaje;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BloqueRepeticion implements Bloque{

    private int iteraciones;
    private Algoritmo algoritmo;

    public BloqueRepeticion(int iteraciones) {
        this.iteraciones = iteraciones;
        this.algoritmo = new Algoritmo();
    }

    public BloqueRepeticion(int iteraciones, ArrayList<Bloque> bloques) {
        this.iteraciones = iteraciones;
        this.algoritmo = new Algoritmo(bloques);
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

        ArrayList <Bloque> secuenciaDeInversos = new ArrayList<Bloque>();
        secuenciaDeInversos = algoritmo.invertirSecuenciaDeBloques();

        BloqueRepeticion bloqueInverso = new BloqueRepeticion(iteraciones, secuenciaDeInversos);

        return bloqueInverso;
    }

}
