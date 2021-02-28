package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.lapiz.EstadoLapiz;
import edu.fiuba.algo3.modelo.lapiz.Lapiz;
import edu.fiuba.algo3.modelo.Posicion;

import edu.fiuba.algo3.modelo.direccion.Direccion;

public class Personaje {

    private Lapiz lapiz;
    private Posicion posicion;
    
    public Personaje(){
        lapiz = new Lapiz();
        posicion = new Posicion(0,0);
    }


    public void cambiarEstadoLapiz(EstadoLapiz nuevoEstado){
        lapiz.cambiarEstado(nuevoEstado);
    }

    public void moverHacia(Direccion direccion) {
        Posicion posicionNueva = direccion.posicionEnDireccionDe(posicion);
        lapiz.dibujarDesdeHasta(posicion, posicionNueva);
        posicion = posicionNueva;
    }

    public Posicion getPosicion(){
        return posicion;
    }


    public int totalDeCasillasPintadas() {
        return lapiz.totalDeCasillasPintadas();
    }


}