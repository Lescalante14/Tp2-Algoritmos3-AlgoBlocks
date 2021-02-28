package edu.fiuba.algo3.modelo.direccion;

import edu.fiuba.algo3.modelo.Posicion;

public class DireccionArriba implements Direccion{

    @Override
    public Posicion posicionEnDireccionDe(Posicion posicion){
        return Posicion.arribaDe(posicion);
    }
}
