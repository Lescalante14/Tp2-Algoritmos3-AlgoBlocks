package edu.fiuba.algo3.modelo.personaje;

import edu.fiuba.algo3.modelo.personaje.lapiz.EstadoLapiz;
import edu.fiuba.algo3.modelo.personaje.lapiz.Lapiz;

import edu.fiuba.algo3.modelo.personaje.direccion.Direccion;
import edu.fiuba.algo3.modelo.personaje.lapiz.SectorDeDibujo;

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


    public void reiniciarPosicion() {
        posicion = new Posicion(0,0);
    }

    public SectorDeDibujo getSectorDibujo() {
        return lapiz.getSectorDibujo();
    }
}