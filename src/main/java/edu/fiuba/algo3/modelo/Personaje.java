package edu.fiuba.algo3.modelo;

public class Personaje {

    private Lapiz lapiz;
    private Posicion posicion;
    
    public Personaje(){
        lapiz = new Lapiz();
        posicion = new Posicion(0,0);
    }

    public EstadoLapiz estadoLapiz(){
        return this.lapiz.estado();
    }

    public void cambiarLapiz(Lapiz unLapiz){
        lapiz = unLapiz;
    }

    public void mover(Posicion posicionNueva){
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