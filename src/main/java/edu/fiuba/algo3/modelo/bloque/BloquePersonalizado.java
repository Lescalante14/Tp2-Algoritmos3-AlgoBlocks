package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.Algoritmo;
import edu.fiuba.algo3.modelo.Personaje;

import java.util.ArrayList;
import java.util.List;

public class BloquePersonalizado implements Bloque {

    private Algoritmo algoritmoPersonalizado;
    private String nombreAlgortimo;

    @Override
    public void ejecutar(Personaje unPersonaje){
        algoritmoPersonalizado.ejecutarAlgoritmo(unPersonaje);
    }

    public BloquePersonalizado(String nombre, List<Bloque> secuenciaBloques) {

        algoritmoPersonalizado = new Algoritmo(secuenciaBloques);
        nombreAlgortimo = nombre;
    }

    @Override
    public Bloque inverso(){

        ArrayList<Bloque> bloques = algoritmoPersonalizado.invertirSecuenciaDeBloques();
        BloquePersonalizado bloqueInverso = new BloquePersonalizado("el inverso", bloques);
        return bloqueInverso;

    }
}
