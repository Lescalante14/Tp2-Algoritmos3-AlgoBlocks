package edu.fiuba.algo3.modelo.personaje.direccion;

import edu.fiuba.algo3.modelo.personaje.Posicion;

public class DireccionArriba implements Direccion{

    @Override
    public Posicion posicionEnDireccionDe(Posicion posicion){
        return Posicion.arribaDe(posicion);
    }
}
