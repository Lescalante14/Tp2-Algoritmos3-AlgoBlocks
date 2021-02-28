package edu.fiuba.algo3.modelo.direccion;

import edu.fiuba.algo3.modelo.Posicion;

public class DireccionDerecha implements Direccion{

    @Override
    public Posicion posicionEnDireccionDe(Posicion posicion){
        return Posicion.derechaDe(posicion);
    }
}
