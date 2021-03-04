package edu.fiuba.algo3.modelo.personaje.direccion;

import edu.fiuba.algo3.modelo.personaje.Posicion;

public class DireccionIzquierda implements Direccion{

    @Override
    public Posicion posicionEnDireccionDe(Posicion posicion){
        return Posicion.izquierdaDe(posicion);
    }

}
