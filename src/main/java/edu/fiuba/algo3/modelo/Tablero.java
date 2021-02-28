package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.algortimo.Algoritmo;

public class Tablero {

    private Algoritmo algoritmo;
    private Personaje personaje;

    public Tablero(Personaje personaje, Algoritmo algoritmo){
        this.algoritmo = algoritmo;
        this.personaje = personaje;
    }

    public Personaje getPersonaje(){
        return personaje;
    }

}
