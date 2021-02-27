package edu.fiuba.algo3.modelo.direccion;

import edu.fiuba.algo3.modelo.Posicion;

public class DireccionAbajo implements Direccion{

    @Override
    Posicion posicionEnDireccionDe(Posicion posicion){
        return Posicion.abajoDe(posicion);
    }

}
